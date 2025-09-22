package com.practice.leetcode.daily;

public class CountElementWithMaxFreq {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int[100];
        for (int i : nums) freq[i - 1]++;
        int max = 0, output = 0;
        for (int i : freq) {
            if (i > max) {
                max = i;
                output = 0;
            }
            if (i == max) output += i;
        }
        return output;
    }
}
