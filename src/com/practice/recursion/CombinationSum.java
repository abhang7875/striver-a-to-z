package com.practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(output, new ArrayList<>(), target, 0, candidates);

        return output;
    }

    public void backtrack(List<List<Integer>> output, List<Integer> temp, int sum, int start, int[] candidates) {
        if (sum < 0)
            return;
        else if (sum == 0)
            output.add(new ArrayList(temp));
        else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(output, temp, sum - candidates[i], i, candidates);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
