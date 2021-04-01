package com.paristaxifare.paristaxifareBack.model;

public class Taxi {
    private int id;
    private int distance;
    private String startTime;
    private int duration;

    public Taxi() {
    }

    public Taxi(int id, int distance, String startTime, int duration) {
        this.id = id;
        this.distance = distance;
        this.startTime = startTime;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", distance=" + distance +
                ", startTime='" + startTime + '\'' +
                ", duration=" + duration +
                '}';
    }


}
