package com.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> output;
    public List<String> generateParenthesis(int n) {
        output = new ArrayList<>();
        solve(n, 0, 0, new StringBuilder());
        return output;
    }
    public void solve(int n, int open, int close, StringBuilder sb) {
        if(open == n && close == n) {
            output.add(sb.toString());
            return;
        }

        if(open < n) {
            sb.append('(');
            solve(n, open + 1, close, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open) {
            sb.append(')');
            solve(n, open, close + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
