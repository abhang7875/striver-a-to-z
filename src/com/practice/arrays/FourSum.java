package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        int prev = 0;
        for (int j = 0; j < nums.length; j++) {
            if(j != 0 && prev == nums[j]) continue;
            int x = 0;
            for (int i = j + 1; i < nums.length; i++) {
                if(i != j + 1 && x == nums[i]) continue;
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    long curr = (long) nums[i] + nums[l] + nums[r] + nums[j];
                    if (curr == target) {
                        output.add(Arrays.asList(nums[j], nums[i], nums[l],nums[r]));
                        int z = nums[l];
                        while(l < r && z == nums[l]) l++;
                        z = nums[r];
                        while(l < r && z == nums[r]) r--;
                    } else if (curr < target)
                        l++;
                    else
                        r--;
                }
                x = nums[i];
            }
            prev = nums[j];
        }
        return output;
    }
}
