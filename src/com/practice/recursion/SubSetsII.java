package com.practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII {
    List<List<Integer>> output;
    int n;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        n = nums.length;
        output = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0, new ArrayList<>());
        return output;
    }

    public void solve(int[] nums, int index, List<Integer> curr) {
        output.add(new ArrayList<>(curr));

        for (int i = index; i < n; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            solve(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
