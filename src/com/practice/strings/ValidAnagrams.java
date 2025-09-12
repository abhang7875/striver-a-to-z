package com.practice.strings;

public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] temp = new int[26];
        for(char ch: s.toCharArray()){
            temp[ch - 'a']++;
        }
        for(char ch: t.toCharArray()){
            temp[ch - 'a']--;
            if(temp[ch - 'a'] < 0) return false;
        }
        return true;
    }
}
