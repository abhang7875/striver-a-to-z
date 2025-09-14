package com.practice.strings;

import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        int freq[] = new int[255];
        for(char ch: s.toCharArray()) freq[ch]++;
        PriorityQueue<int[]> data = new PriorityQueue<>((a, b)-> b[1] - a[1]);
        for(int i = 0; i < 255; i++) {
            if(freq[i] == 0) continue;
            data.add(new int[]{i, freq[i]});
        }
        StringBuilder sb = new StringBuilder();
        while(!data.isEmpty()) {
            int[] temp = data.poll();
            char ch = (char) temp[0];
            int n = temp[1];
            for(int i = 0; i < n; i++) sb.append(ch);
        }

        return sb.toString();
    }
}
