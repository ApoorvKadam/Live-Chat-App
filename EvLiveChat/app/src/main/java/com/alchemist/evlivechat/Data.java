package com.alchemist.evlivechat;

public class Data {
    private String message;
    private String name;


    public Data(String message,String name){
        this.message=message;
        this.name=name;
    }
    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
