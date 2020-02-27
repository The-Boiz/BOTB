package com.example.botb;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DummyBoxDatabase{
    private List<Box> list;
    public DummyBoxDatabase(){
        list = new ArrayList<>();
        list.add(new Box("Quaker","Brownie",R.drawable.brownie));
        list.add(new Box("Marie Calendar","Cake",R.drawable.cake));
        list.add(new Box("Burger King","Fish Stick",R.drawable.fishstick));
        list.add(new Box("Tony Pepperoni","Pizza",R.drawable.pizza));
    }

    public List<Box> getList() {
        return list;
    }
}
