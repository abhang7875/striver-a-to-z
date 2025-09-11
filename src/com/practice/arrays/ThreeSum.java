package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i-1] == nums[i]) continue;
            int target = -nums[i];
            int left = i + 1, right = n - 1;
            while(left < right) {
                int curr = nums[left] + nums[right];
                if(curr == target) {
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    int temp = nums[left];
                    while(left < right && nums[left] == temp) left++;
                    temp = nums[right];
                    while(left < right && nums[right] == temp)right--;
                } else if(curr > target) right--;
                else left++;
            }
        }

        return output;
    }
}
