package com.practice.leetcode.daily;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int output = numBottles;
        while (numBottles >= numExchange) {
            int temp = numBottles / numExchange;
            numBottles -= temp * numExchange;
            numBottles += temp;
            output += temp;
        }
        return output;
    }
}
