package com.rayan.course.java;

/**
 * Created by saeed on 1/11/16.
 */
public enum Days {

    SUNDAY("یکشنبه", false), FRIDAY("چمعه", true);

     String name;
    private boolean holiday;

    public String getName() {
        return name;
    }

    Days(String name, boolean holiday) {
        this.name = name;
        this.holiday = holiday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHoliday() {
        return holiday;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }
}
