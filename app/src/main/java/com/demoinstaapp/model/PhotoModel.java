package com.demoinstaapp.model;


public class PhotoModel {

    private int drawableId;
    private String name;

    public PhotoModel(int drawableId) {
        this.drawableId = drawableId;

    }

    public int getDrawableId() {
        return drawableId;
    }

    public String getName() {
        return name;
    }
}

