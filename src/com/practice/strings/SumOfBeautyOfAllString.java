package com.practice.strings;

public class SumOfBeautyOfAllString {
    public int beautySum(String s) {
        int sum = 0;
        char ch[] = s.toCharArray();
        int n = ch.length;

        for(int i = 0; i < n; i++) {
            int freq[] = new int[26];
            for(int j = i ; j < n; j++) {
                freq[ch[j] - 'a']++;
                int min =Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int k: freq) {
                    if(k == 0) continue;
                    max = Math.max(k, max);
                    min = Math.min(k, min);
                }
                sum += (max - min);
            }
        }
        return sum;
    }
}
