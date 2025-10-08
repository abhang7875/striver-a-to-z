package com.practice.leetcode.daily;

public class WaterBottlesII {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int output = 0;
        while(numBottles >= numExchange) {
            numBottles -= (numExchange - 1);
            output += numExchange;
            numExchange++;
        }
        return output + numBottles;
    }
}
