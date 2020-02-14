package com.example.botb;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DummyBoxDatabase{
    private List<Box> list;
    private Context context;
    public DummyBoxDatabase(){
        list = new ArrayList<>();
        list.add(new Box("Quaker","Brownie",R.drawable.);
    }

    public List<Box> getList() {
        return list;
    }
}
