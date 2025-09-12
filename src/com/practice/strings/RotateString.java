package com.practice.strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n != goal.length()) return false;
        for(int i = 1; i < n; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i, n);
            if(goal.indexOf(a) != -1 && goal.indexOf(b) != -1) return true;
        }
        return false;
    }
}
