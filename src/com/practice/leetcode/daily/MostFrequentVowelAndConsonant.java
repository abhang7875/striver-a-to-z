package com.practice.leetcode.daily;

public class MostFrequentVowelAndConsonant {
    private boolean isVowel(char ch) {
        return  ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        for(char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int max1 = 0, max2 = 0;
        for(int i = 0; i < 26; i++) {
            if(isVowel((char)('a' + i))) {
                max1 = Math.max(max1, freq[i]);
            }else {
                max2 = Math.max(max2, freq[i]);
            }
        }

        return max1+max2;
    }
}
