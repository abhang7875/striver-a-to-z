package com.practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    List<List<Integer>> output;
    int n;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        output = new ArrayList<>();
        n = candidates.length;
        solve(candidates, 0, 0, target, new ArrayList<>());
        return output;
    }

    public void solve(int[] candidates, int index, int currSum, int target, List<Integer> curr) {
        if (currSum > target) return;
        if (currSum == target) {
            output.add(new ArrayList(curr));
            return;
        }
        for (int i = index; i < n; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            if (currSum + candidates[i] > target) break;
            curr.add(candidates[i]);
            solve(candidates, i + 1, currSum + candidates[i], target, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
