package com.rayan.course.java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by saeed on 12/21/15.
 */
public class Time1Test {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void setTime_setCorrectParameter_createTime1ObjectSuccessfully() {
        Time1 time1 = new Time1();
        time1.setTime(11, 1, 1);
    }

    @Test
    public void getUniversalTime_setCorrectParameter_getWellFormStringTime() {
        Time1 time1 = new Time1();
        time1.setTime(11, 1, 1);

        assertThat(time1.getUniversalTime()).isEqualTo("11:1:1");
    }

    @Test
    public void setTime_setIncorrectParameter_ThrowingException() {
        Time1 time1 = new Time1();

        exception.expect(IllegalArgumentException.class);
        time1.setTime(25, 1, 1);
    }

}
