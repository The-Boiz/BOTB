package com.example.botb;

import android.graphics.drawable.Drawable;

public class Box {
    private String brand;
    private String name;
    private int imageID;
    public Box(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }
    public Box() {
        this.brand = null;
        this.name = null;
        this.imageID = 0;
    }
    public Box(String brand, String name, int imageID){
        this.brand = brand;
        this.name = name;
        this.imageID = imageID;
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

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
