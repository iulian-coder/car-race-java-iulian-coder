package com.codecool.car_race;

import java.util.Random;

public class Car extends Vehicle {
    private final String name;
    private int speed;
    private int distanceTraveled;


    public Car() {
        this.name = getName();
        this.speed = getSpeed();
        this.distanceTraveled = 0;
    }

    @Override
    public String getName() {
        String[] brandName = {"PEKE", "MERE", "ALU"};
        String[] seriesName = {"Vortex", "Cobra", "Titan", "Tire", "Prospect", "Hydra",
                "Jazz", "Gallop", "Dominion", "Lioness"};

        Random random = new Random();//instance of random class
        int randNumberSeries = random.nextInt(seriesName.length);
        int randNumberBrand = random.nextInt(brandName.length);
        return brandName[randNumberBrand] + " " + seriesName[randNumberSeries];
    }

    private int getSpeed() {
        return (int) (Math.random() * ((110 - 80) + 1)) + 80;
    }

    @Override
    public int distanceTraveled() {
        return this.distanceTraveled;
    }

    @Override
    public void prepareForLap() {
        YellowFlag yellowFlag = new YellowFlag();
        if (yellowFlag.isYellowFlagActive()) {
            this.speed = 75;
        } else {
            this.speed = getSpeed();
        }
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        this.distanceTraveled += this.speed;

    }

    @Override
    public String toString() {
        return "Type Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed + " Km/h" +
                ", distanceTraveled=" + distanceTraveled + " Km" +
                '}';
    }
}
