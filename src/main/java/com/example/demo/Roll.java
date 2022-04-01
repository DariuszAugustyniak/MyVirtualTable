package com.example.demo;

import java.lang.Math;

public class Roll {
    private final String result;
    private final long id;

    public long getId() {
        return id;
    }

    public String getResult() {
        return result;
    }

    public Roll(long id, String result) {
        this.id = id;
        this.result = result;
    }

    public Roll(long id) {
        this.id = id;
        Double rand = (Math.random()*100)+1;
        Integer d100result =  rand.intValue();
        this.result = d100result.toString();
    }

    public Roll(long id, Integer dice) {
        this.id = id;
        Double rand = (Math.random()*dice)+1;
        Integer d100result =  rand.intValue();
        this.result = d100result.toString();
    }


}
