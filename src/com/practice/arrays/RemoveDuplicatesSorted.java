package com.practice.arrays;

public class RemoveDuplicatesSorted {
    public int removeDuplicates(int[] nums) {
        int z = 0, n = nums.length;
        for(int i = 1; i < n; i++) {
            if(nums[z] != nums[i]) {
                z++;
                nums[z] = nums[i];
            }
        }
        return z + 1;
    }
}
