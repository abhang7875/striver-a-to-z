package com.practice.arrays;

public class IsSortedArray {
    public static boolean check(int[] nums) {
        int i = 0, n = nums.length;
        while (i < n && nums[i] <= nums[(i + 1) % n]) i++;
        do{
            i++;
        }while (i < n && nums[i] <= nums[(i + 1) % n]);

        return i >= n;
    }
}
