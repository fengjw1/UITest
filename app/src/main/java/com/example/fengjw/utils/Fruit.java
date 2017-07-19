package com.example.fengjw.utils;

/**
 * Created by fengjw on 2017/7/19.
 */

public class Fruit {
    private String name;
    private int imageID;

    public Fruit(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }

    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }

}
