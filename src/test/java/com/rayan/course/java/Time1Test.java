package com.rayan.course.java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by saeed on 12/21/15.
 */
public class Time1Test {

    @Test(expected=IllegalArgumentException.class)
    public void setTime_setWrongHour_throwIllegalArgumentException() {
        Time1 time1;

        time1 = new Time1(25, 1, 1);

    }

    @Test(expected=IllegalArgumentException.class)
    public void setTime_setWrongMinute_throwIllegalArgumentException() {
        Time1 time1;

        time1 = new Time1(1, 61, 1);


    }
    @Test(expected=IllegalArgumentException.class)
    public void setTime_setWrongSecond_throwIllegalArgumentException() {
        Time1 time1;

        time1 = new Time1(1, 1, 65);


    }

    @Test(expected=IllegalArgumentException.class)
    public void setTime_setWrongHourForSingleParamConstructor_throwIllegalArgumentException() {
        Time1 time1;

        time1 = new Time1(25);


    }
    @Test(expected=IllegalArgumentException.class)
    public void setTime_setWrongHourAndMinuteForDoubleParamConstructor_throwIllegalArgumentException() {
        Time1 time1;

        time1 = new Time1(25, 61);


    }

    @Test
    public void setTime_setCorrectTimeDate_setupCorrectObject() {
        Time1 time1 = new Time1(11, 1, 1);

        assertThat(time1.toString()).isEqualTo("11:1:1");
    }

    @Test
    public void overloadedConstructor_setOptionalParam_setupCorrectObject() {
        Time1 time1 = new Time1(11);
        assertThat(time1.toString()).isEqualTo("11:0:0");

        time1 = new Time1(11, 1);
        assertThat(time1.toString()).isEqualTo("11:1:0");

        time1 = new Time1();
        assertThat(time1.toString()).isEqualTo("0:0:0");

    }
}
