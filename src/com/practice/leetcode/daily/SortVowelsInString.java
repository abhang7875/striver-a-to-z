package com.practice.leetcode.daily;

public class SortVowelsInString {
    private int isVowel(char ch) {
        if(ch == 'A') return 0;
        if(ch == 'E') return 1;
        if(ch == 'I') return 2;
        if(ch == 'O') return 3;
        if(ch == 'U') return 4;
        if(ch == 'a') return 5;
        if(ch == 'e') return 6;
        if(ch == 'i') return 7;
        if(ch == 'o') return 8;
        if(ch == 'u') return 9;
        return -1;
    }

    private char getChar(int ch) {
        if(ch == 0) return 'A';
        if(ch == 1) return 'E';
        if(ch == 2) return 'I';
        if(ch == 3) return 'O';
        if(ch == 4) return 'U';
        if(ch == 5) return 'a';
        if(ch == 6) return 'e';
        if(ch == 7) return 'i';
        if(ch == 8) return 'o';
        if(ch == 9) return 'u';
        return ' ';
    }
    public String sortVowels(String s) {
        int [] freq = new int[10];
        char arr[] = s.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int temp = isVowel(arr[i]);
            if(temp != -1) {
                arr[i] = '#';
                freq[temp]++;
            }
        }
        int z = 0;
        for(int i = 0; i < 10; i++) {
            while(freq[i] > 0) {
                if(arr[z] == '#') {
                    arr[z] = getChar(i);
                    freq[i]--;
                }
                z++;
            }
        }
        return new String(arr);
    }
}
