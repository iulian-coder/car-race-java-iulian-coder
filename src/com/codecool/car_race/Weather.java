package com.codecool.car_race;


public class Weather {

    private int chanceOfRain;
    private boolean isRaining;


    public Weather() {

        this.chanceOfRain = 30;
        this.isRaining = false;

    }

    public void setRaining() {
        int randomChanceOfRaine = (int) (Math.random() * ((100 - 30) + 1)) + 30;
        this.chanceOfRain = randomChanceOfRaine;
        this.isRaining = randomChanceOfRaine > 50;
    }

    public boolean getIsRaining() {
        return this.isRaining;
    }

    public int getChanceOfRain() {
        return chanceOfRain;
    }
}
