package com.example.demo;

import java.util.ArrayList;

public class RollWrathAndGlory2e {


    private final long id;
    private final ArrayList<Integer> rolls = new ArrayList<Integer>();
    private final long success;
    private final long wrathDie;

    public RollWrathAndGlory2e(long id, long amountRolls) {
        this.id = id;
        for (int i = 0; i < amountRolls; i++) {
            rolls.add(d6roll());
        }
        long tempSuccsess = 0;
        for (long roll : rolls) {
            if (roll >= 4) {
                tempSuccsess++;
            }
            if (roll >= 6) {
                tempSuccsess++;
            }
        }
        success = tempSuccsess;
        wrathDie = rolls.get(0);
    }

    private Integer d6roll() {
        Double rand = (Math.random() * 6) + 1;
        Integer d6result = rand.intValue();
        return d6result;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Integer> getRolls() {
        return rolls;
    }

    public long getSuccess() {
        return success;
    }

    public long getWrathDie() {
        return wrathDie;
    }
}
