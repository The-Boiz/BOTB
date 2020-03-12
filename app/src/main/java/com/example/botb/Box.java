package com.example.botb;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class Box {
    private String brand;
    private String name;
    private Bitmap picture;
    public Box() {
        this.brand = null;
        this.name = null;
        this.picture = null;
    }
    public Box(String brand, String name, Bitmap picture){
        this.brand = brand;
        this.name = name;
        this.picture = picture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }
}
