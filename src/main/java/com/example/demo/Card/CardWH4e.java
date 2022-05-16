package com.example.demo.Card;

public class CardWH4e {

    String name;

    String gameClass;

    String race;

    String skills;

    Long id;


    public String getName() {
        return name;
    }


    public String getGameClass() {
        return gameClass;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGameClass(String gameClass) {
        this.gameClass = gameClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getGameClass()  + "," + getRace() + "," + getSkills();
    }


}
