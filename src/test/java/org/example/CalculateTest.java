package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void calculate_simple() {
        int[] nums = {1, 4, 10};
        assertEquals(2, Calculate.calculate(nums));
    }
    @Test
    void calculate_reversed() {
        int[] nums = {10, 4, 1};
        assertEquals(2, Calculate.calculate(nums));
    }

    @Test
    void calculate_complex() {
        int[] nums = {1, 4, 10, 100, 10000, 1000000, 200, 12, 12};
        assertEquals(1, Calculate.calculate(nums));
    }

    @Test
    void calculate_many_same_distance() {
        int[] nums = {1, 3};
        int[] nums2 = {1, 3, 5};
        int[] nums3 = {1, 3, 5, 7};
        int[] nums4 = {1, 3, 5, 7, 9};
        int shortest1 = Calculate.calculate(nums);
        int shortest2 = Calculate.calculate(nums2);
        int shortest3 = Calculate.calculate(nums3);
        int shortest4 = Calculate.calculate(nums4);

        assertEquals(1, shortest1);
        assertEquals(1, shortest2);
        assertEquals(1, shortest3);
        assertEquals(1, shortest4);
    }
}