package com.practice.strings;

public class MaxDepthOfParentheses {
    public int maxDepth(String s) {
        int count = 0, output = 0;
        for(char ch: s.toCharArray()){
            if(ch=='(') count++;
            else if(ch ==')') count--;

            output = Math.max(output, count);
        }
        return output;
    }
}
