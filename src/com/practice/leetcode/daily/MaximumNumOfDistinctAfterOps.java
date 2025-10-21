package com.practice.leetcode.daily;

import java.util.Arrays;

public class MaximumNumOfDistinctAfterOps {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int output = 0, prev = Integer.MIN_VALUE;

        for(int i: nums) {
            int curr = Math.max(i - k, prev + 1);
            if(curr <= i + k) {
                prev = curr;
                output++;
            }
        }
        return output;
    }
}
