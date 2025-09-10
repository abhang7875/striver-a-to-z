package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> data = new HashMap<>();
        int sum = 0, count = 0;
        data.put(0,1);

        for(int i: nums) {
            sum += i;
            if(data.containsKey(sum - k)) count += data.get(sum - k);
            data.put(sum, data.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
