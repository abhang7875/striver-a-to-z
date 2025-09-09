package com.practice.arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }else if(nums[n - 1 - i] + nums[n- 1 - j] == target){
                    return new int[]{n-1-i,n-1-j};
                }
            }
        }
        return new int[]{};
    }
}
