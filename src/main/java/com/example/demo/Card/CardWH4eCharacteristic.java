package com.example.demo.Card;

public class CardWH4eCharacteristic {
   String name;
   Long initial;
   Long advancement;
   Long current;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getInitial() {
        return initial;
    }

    public void setInitial(Long initial) {
        this.initial = initial;
    }

    public Long getAdvancement() {
        return advancement;
    }

    public void setAdvancement(Long advancement) {
        this.advancement = advancement;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "CardWH4eCharacteristic{" +
                "name='" + name + '\'' +
                ", initial=" + initial +
                ", advancement=" + advancement +
                ", current=" + current +
                '}';
    }
}
