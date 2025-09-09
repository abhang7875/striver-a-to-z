package com.practice.arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int curr = 0, max = Integer.MIN_VALUE;
        for(int i: nums) {
            curr += i;
            if(curr > max) max = curr;
            if(curr < 0) curr = 0;
        }
        return max;
    }
}
