package com.rayan.course.java;

import com.rayan.course.java.employee.CommissionEmployee;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by saeed on 12/21/15.
 */
public class CommissionEmployeeTest {

    @Test(expected=IllegalArgumentException.class)
    public void test_CommissionEmployee_invalidGrossSalesConstructor() {
        CommissionEmployee employee = new CommissionEmployee(
                "Ali", "Ahmadi", "111111111", -2, 0.2
        );

    }

    @Test(expected=IllegalArgumentException.class)
    public void test_CommissionEmployee_invalidRateConstructor() {
        CommissionEmployee employee = new CommissionEmployee(
                "Ali", "Ahmadi", "111111111", 200000, -0.1
        );

    }

    @Test
    public void testEarning_CommissionEmployee_Success() {
        CommissionEmployee employee = new CommissionEmployee(
                "Ali", "Ahmadi", "111111111", 100000, 0.2
        );

        assertThat(employee.earnings()).isEqualTo(20000);
;

    }
}
