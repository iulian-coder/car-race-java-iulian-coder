package com.codecool.car_race;


public class YellowFlag {

    private boolean YellowFlagStatus;

    public YellowFlag(){
        this.YellowFlagStatus = false;

    }

    public void setYellowFlag(boolean dataTruck){
        this.YellowFlagStatus = dataTruck;
    }

    public boolean isYellowFlagActive(){
        return this.YellowFlagStatus;
    }

    @Override
    public String toString() {
        return "YellowFlag{" +
                "YellowFlagStatus='" + YellowFlagStatus + '\'' +
                '}';
    }
}
