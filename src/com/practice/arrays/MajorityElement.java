package com.practice.arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int ans = nums[0], freq = 1;
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            if(ans == nums[i]) freq++;
            else {
                freq--;
                if(freq == 0) {
                    ans = nums[i+1];
                }
            }
        }
        return ans;
    }
}
