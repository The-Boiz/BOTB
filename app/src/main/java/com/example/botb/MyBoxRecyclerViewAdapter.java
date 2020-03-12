package com.example.botb;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.botb.BoxFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Box} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyBoxRecyclerViewAdapter extends RecyclerView.Adapter<MyBoxRecyclerViewAdapter.ViewHolder> {

    private List<Box> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyBoxRecyclerViewAdapter(List<Box> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_box, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.brand.setText(mValues.get(position).getBrand());
        holder.name.setText(mValues.get(position).getName());
        holder.image.setImageBitmap(mValues.get(position).getImage());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                        mListener.onListFragmentInteraction(holder.mItem);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView brand;
        public final TextView name;
        public final ImageView image;
        public Box mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            brand = view.findViewById(R.id.brand);
            name = view.findViewById(R.id.name);
            image = view.findViewById(R.id.imageView);
        }
    }

    public void filterList(List<Box> filteredBoxList) {
        mValues = filteredBoxList;
        notifyDataSetChanged();
    }
}
