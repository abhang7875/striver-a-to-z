package com.practice.arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, output = 0;
        for(int i: nums) {
            if(i == 0) count = 0;
            else count++;
            if(count > output) output = count;
        }
        return output;
    }
}
