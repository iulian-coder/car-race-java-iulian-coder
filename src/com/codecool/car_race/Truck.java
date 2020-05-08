package com.codecool.car_race;

import java.util.Random;

public class Truck extends Vehicle {
    private final String name;
    private int speed;
    private int distanceTraveled;
    private int breakDownTurnsLeft;
    private boolean isBroken;



    public Truck() {
        this.name = getName();
        this.speed = 100;
        this.distanceTraveled = 0;
        this.breakDownTurnsLeft = 0;
        this.isBroken = false;
    }

    public boolean getIsBroken(){
        return this.isBroken;
    }

    @Override
    public String getName() {
        Random random = new Random();
        return String.valueOf(random.nextInt(1000));
    }

    @Override
    public int distanceTraveled() {
        return this.distanceTraveled;
    }

    @Override
    public void prepareForLap() {
        Random random = new Random();
        float brokenChance = random.nextFloat();
        if (brokenChance <= 0.05f) {
            this.speed = 0;
            this.breakDownTurnsLeft = 2;
            this.isBroken = true;
        }
    }

    @Override
    public void moveForAnHour() {
        YellowFlag yellowFlag = new YellowFlag();
        prepareForLap();
        if (this.breakDownTurnsLeft != 0){
            this.breakDownTurnsLeft -=1;
            this.speed = 0;
            yellowFlag.setYellowFlag(true);
            System.out.println("TESTTTTTTT"+this.breakDownTurnsLeft);

        }else {
            this.speed = 100;
            this.distanceTraveled += this.speed;
            this.isBroken = false;
            this.breakDownTurnsLeft = 0;
        }

    }

    @Override
    public String toString() {
        return "Type Truck{" +
                "name='" + name + '\'' +
                ", speed=" + speed + " Km/h" +
                ", distanceTraveled=" + distanceTraveled + " Km" +
                '}';
    }
}
