package com.practice.arrays;

public class RearrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] output = new int[n];
        int pos = 0, neg = 1;
        for(int i: nums) {
            if(i < 0) {
                output[neg] = i;
                neg += 2;
            } else {
                output[pos] = i;
                pos += 2;
            }
        }
        return output;
    }
}
