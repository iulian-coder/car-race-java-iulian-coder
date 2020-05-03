package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Vehicle> racers = new ArrayList<>();


    public void registerRacer(Vehicle racers) {
        this.racers.add(racers);
    }

    public List<Vehicle> getRacers() {
        return this.racers;
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace() {
        Weather weather = new Weather();
        YellowFlag yellowFlag = new YellowFlag();


        for (int lap = 0; lap < 50; lap++) {
//            System.out.println("LAP No. -> " + lap);
//            System.out.println("Chance of rain " + weather.getChanceOfRain() + "%" + " is it raining "+ weather.getIsRaining());
            System.out.println(yellowFlag);
//            weather.setRaining();
            for (Vehicle raceCompetitor : racers) {
                raceCompetitor.moveForAnHour();
            }
//            printRaceResults();


        }
    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        for (Vehicle raceCompetitor : racers) {
            System.out.print(raceCompetitor + " \n");
        }

    }

}
