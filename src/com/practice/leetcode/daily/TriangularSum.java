package com.practice.leetcode.daily;

public class TriangularSum {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return (nums[1] + nums[0]) % 10;
        for(int i = n-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                nums[j] = (nums[j] + nums[j+1]) % 10;
            }
        }
        return nums[0];
    }
}
