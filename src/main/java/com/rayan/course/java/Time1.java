package com.rayan.course.java;

/**
 * Created by saeed on 1/4/16.
 */
public class Time1 {

    public static final int SUNDAY = 1;
    public static final int FRIDAY = 2;

    private int hour;
    private int minute;
    private int second;

    public Time1(int hour, int minute, int second) {

        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
                second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                    "hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time1() {
        this(0, 0, 0);
    }

    public Time1(int hour) {
        this(hour, 0, 0);
    }

    public Time1(int hour, int minute) {
        this(hour, minute, 0);
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }

}
