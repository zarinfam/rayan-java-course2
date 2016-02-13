package com.rayan.course.java;

import com.rayan.course.java.employee.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by saeed on 12/21/15.
 */
public class CommissionEmployeeTest {

    @Test(expected = IllegalArgumentException.class)
    public void test_CommissionEmployee_invalidGrossSalesConstructor() {
        CommissionEmployee employee = new CommissionEmployee(
                "Ali", "Ahmadi", "111111111", -2, 0.2
        );

    }

    @Test(expected = IllegalArgumentException.class)
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

    }

    @Test
    public void testEquality_CommissionEmployee() {
        List<Payable> payableList = new ArrayList<>(Arrays.asList(
                new CommissionEmployee("Ali", "Ahmadi", "111111111", 100000, 0.2)//20
                , new BasePlusCommissionEmployee("Mahbobeh", "Ahmadi", "111111111", 100000, 0.2, 200000)//220
                , new CommissionEmployee("Hossein", "Ahmadi", "111111111", 100000, 0.2)//20
                , new Invoice("table", "table", 9, 50000)//450
        ));

        assertThat(payableList.stream()
                .map(p -> (int)(p.getPaymentAmount())).reduce(Integer::sum)
                .orElse(0)).isEqualTo(710000);

    }
}
