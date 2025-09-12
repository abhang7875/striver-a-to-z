package com.practice.arrays;

public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int currMin = 1, currMax = 1;
        for(int i: nums) {
            int temp = currMax * i;
            currMax = Math.max(i, Math.max(temp, currMin * i));
            currMin = Math.min(i, Math.min(temp, currMin * i));
            res = Math.max(res, currMax);
        }
        return res;
    }
}
