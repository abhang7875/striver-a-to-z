package com.practice.recursion;

public class MyAtoi {
    public int myAtoi(String s) {
        boolean flag = false, start = false;
        long output = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!start && s.charAt(i) != ' ') {
                start = true;
                if (s.charAt(i) == '-') {
                    flag = true;
                    i++;
                } else if (s.charAt(i) == '+') {
                    i++;
                }

            }
            if (start) {
                if (i < s.length() && Character.isDigit(s.charAt(i))) {
                    if (!flag && output > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                    if (flag && -output < Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                    output = (output * 10) + (s.charAt(i) - '0');
                } else
                    break;
            }
        }
        if (!flag && output > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (flag && -output < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return flag ? -(int) output : (int) output;
    }
}
