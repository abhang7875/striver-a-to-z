package com.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
    String [] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> output;
    int n;
    public List<String> letterCombinations(String digits) {
        n = digits.length();
        output = new ArrayList<>();
        if(n == 0) return output;
        solve(digits, 0, new StringBuilder());
        return output;
    }

    public void solve(String digits, int index, StringBuilder sb) {
        if(index == n) {
            output.add(sb.toString());
            return;
        }
        char ch = digits.charAt(index);
        String map = mappings[ch - '0'];

        for(char c: map.toCharArray()) {
            sb.append(c);
            solve(digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
