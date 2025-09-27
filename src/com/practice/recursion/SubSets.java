package com.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    List<List<Integer>> output;
    int n;
    public List<List<Integer>> subsets(int[] nums) {
        output = new ArrayList<>();
        n = nums.length;
        solve(nums, 0, new ArrayList<>());
        return output;
    }

    public void solve(int [] nums, int index, List<Integer> curr) {
        if(index == n) {
            output.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        solve(nums, index + 1, curr);
        curr.remove(curr.size() - 1);
        solve(nums, index + 1, curr);
    }
}
