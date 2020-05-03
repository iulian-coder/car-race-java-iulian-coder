package com.codecool.car_race;


public class Motorcycle extends Vehicle {
    private final String name;
    private final int motorcycleNumber;
    private int speed;
    private int distanceTraveled;


    public Motorcycle(int motorcycleNumber) {
        this.motorcycleNumber = motorcycleNumber;
        this.name = getName();
        this.speed = 100;
        this.distanceTraveled = 0;

    }


    @Override
    public String getName() {
        return ("Motorcycle " + motorcycleNumber);
    }

    @Override
    public int distanceTraveled() {

        return this.distanceTraveled;
    }

    @Override
    public void prepareForLap() {
        Weather weather = new Weather();
        if (weather.getIsRaining()) {
            this.speed = 100 - (int) (Math.random() * ((50 - 5) + 1)) + 5;
        }
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        this.distanceTraveled += this.speed;

    }

    @Override
    public String toString() {
        return "Type Motorcycle{" +
                "name='" + name + '\'' +
                ", speed=" + speed + " Km/h" +
                ", distanceTraveled=" + distanceTraveled + " Km" +
                '}';
    }
}
