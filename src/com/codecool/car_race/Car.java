package com.codecool.car_race;

import java.util.Random;

public class Car extends Vehicle {
    private String carName;
    private int normalSpeed;
    private int distanceTraveled;

    private String generateName(){
        String[] brandName = {"PEKE", "MERE", "ALU"};
        String[] seriesName = {"Vortex","Cobra","Titan","Tire", "Prospect","Hydra",
                "Jazz","Gallop", "Dominion", "Lioness"};

        Random random = new Random();//instance of random class
        int randNumberSeries = random.nextInt(seriesName.length);
        int randNumberBrand = random.nextInt(brandName.length);
        return brandName[randNumberBrand] + " " + seriesName[randNumberSeries];
    }

    private int generateSpeed(){
        return (int)(Math.random() * ((110 - 80) + 1)) + 80;
    }

    public Car(){
        this.carName = generateName();
        this.normalSpeed = generateSpeed();
        this.distanceTraveled = 0;
    }

    @Override
    public void distanceTraveled() {

    }

    @Override
    public void prepareForLap() {

    }

    @Override
    public void moveForAnHour(){
        this.distanceTraveled += this.normalSpeed;

    }

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + carName + '\'' +
                ", Speed= " + normalSpeed + " Km/h" +
                ", Distance= " + distanceTraveled + " Km" +
                '}';
    }
}
