package com.example.demo.Card;

import java.util.List;

public class CardWH4e {

    String name;

    String gameClass;

    String race;

    Long id;

    List<CardWH4eCharacteristic> characteristicNameMap;

    public  List<CardWH4eCharacteristic> getCharacteristicNameMap() {
        return characteristicNameMap;
    }

    public void setCharacteristicNameMap( List<CardWH4eCharacteristic> characteristicNameMap) {
        this.characteristicNameMap = characteristicNameMap;
    }


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


    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getGameClass() + "," + getRace() + "," + getCharacteristicNameMap();
    }


}
