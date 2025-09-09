package com.practice.arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int curr = 0;
        for(int i: nums) curr += i;
        return total - curr;
    }
}
