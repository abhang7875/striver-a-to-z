package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());
        output.get(0).add(1);
        for(int i = 1; i < numRows; i++){
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = output.get(i - 1);
            curr.add(1);
            for(int j = 1; j < prev.size(); j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            output.add(curr);
        }
        return output;
    }
}
