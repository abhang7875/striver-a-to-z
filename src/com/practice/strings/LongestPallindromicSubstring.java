package com.practice.strings;

public class LongestPallindromicSubstring {
    char ch[];
    int n;
    public String longestPalindrome(String s) {
        ch = s.toCharArray();
        n = ch.length;
        String output = "";
        for(int i = 0; i < n; i++) {
            String a = expandFromMiddle(s, i, i);
            String b = expandFromMiddle(s, i, i + 1);

            if(output.length() < a.length()) output = a;
            if(output.length() < b.length()) output = b;
        }
        return output;
    }

    public String expandFromMiddle(String s, int left, int right) {
        while(left >= 0 && right < n && ch[left] == ch[right]) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
