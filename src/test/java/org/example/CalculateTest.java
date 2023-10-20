package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void calculate() {
        int[] nums = {1, 4, 10};
        Assertions.assertEquals(2, Calculate.calculate(nums));
    }
}