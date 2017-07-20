package com.example.fengjw.utils;

/**
 * Created by fengjw on 2017/7/20.
 */

public class Msg {
    public static final int TYPE_ERCEIVED = 0;
    public static final int TYPE_SEND = 1;
    private String content;
    private int type;
    public Msg(String content, int type){
        this.content = content;
        this.type = type;
    }

    public String getContent(){
        return content;
    }

    public int getType(){
        return type;
    }


}
