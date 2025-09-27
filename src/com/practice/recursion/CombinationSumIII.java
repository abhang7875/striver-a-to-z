package com.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    List<List<Integer>> output;
    public List<List<Integer>> combinationSum3(int k, int n) {
        output = new ArrayList<>();
        solve(k, n, 0, 0, new ArrayList<>());

        return output;
    }

    public void solve(int k, int n, int index, int currSum, List<Integer> curr) {
        if(curr.size() == k && currSum == n) {
            output.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index + 1; i < 10; i++) {
            curr.add(i);
            solve(k, n, i, currSum + i, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
