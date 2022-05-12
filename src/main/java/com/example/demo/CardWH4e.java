package com.example.demo;

public class CardWH4e {

    String name;

    String game_class;

    String race;

    String skills;

    Long id;


    public String getName() {
        return name;
    }


    public String getGame_class() {
        return game_class;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGame_class(String game_class) {
        this.game_class = game_class;
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
        return getId() + "," + getName() + "," + getGame_class()  + "," + getRace() + "," + getSkills();
    }


}
