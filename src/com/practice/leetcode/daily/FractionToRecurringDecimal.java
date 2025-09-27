package com.practice.leetcode.daily;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";

        StringBuilder output = new StringBuilder();
        if(numerator < 0 ^ denominator < 0) output.append('-');

        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        output.append(dividend / divisor);
        long rem = dividend % divisor;

        if(rem == 0) return output.toString();

        Map<Long, Integer> map = new HashMap<>();
        output.append('.');

        while(rem != 0) {
            if(map.containsKey(rem)) {
                output.insert(map.get(rem), "(");
                output.append(')');
                return output.toString();
            }
            map.put(rem, output.length());
            rem *= 10;
            output.append(rem / divisor);
            rem %= divisor;
        }
        return output.toString();
    }
}
