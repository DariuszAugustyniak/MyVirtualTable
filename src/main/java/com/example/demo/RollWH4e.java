package com.example.demo;

public class RollWH4e {

    private final String rollResult;
    private final long id;
    private final long SL;

    public String getRollResult() {
        return rollResult;
    }

    public long getId() {
        return id;
    }

    public long getSL() {
        return SL;
    }


    public RollWH4e(long id, long skill) {
        this.id = id;
        Double rand = (Math.random() * 100) + 1;
        Integer d100result = rand.intValue();
        this.rollResult = d100result.toString();
        this.SL = skill / 10 - d100result / 10;

    }
}
