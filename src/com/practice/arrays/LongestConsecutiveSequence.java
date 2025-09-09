package com.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int i: nums) data.add(i);
        int output = 0;
        for(int i: data) {
            if(!data.contains(i-1)) {
                int count = 0;
                while(data.contains(i)) {
                    count++;
                    i++;
                }
                if(count > output) output = count;
            }
        }
        return output;
    }
}
