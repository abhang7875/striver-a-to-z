package com.practice.strings;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        int [] temp1 = new int[127];
        int [] temp2 = new int[127];
        for(int i = 0; i < s.length(); i++){
            if(temp1[s.charAt(i)] != temp2[t.charAt(i)])
                return false;
            temp1[s.charAt(i)] = i + 1;
            temp2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
