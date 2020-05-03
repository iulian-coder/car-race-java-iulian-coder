package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Car> racers = new ArrayList<>();


    public void registerRacer(Car racers) {
        this.racers.add(racers);
    }

    public List<Car> getRacers() {
        return this.racers;
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace() {
        int hour = 1;
        while (hour <50){
            for (Car car: racers){
                car.moveForAnHour();
            }
            hour++;
        }

    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        System.out.println("<-->Race Results<-->");
        for (Car car: racers){
            System.out.println(car);
        }

    }

}
