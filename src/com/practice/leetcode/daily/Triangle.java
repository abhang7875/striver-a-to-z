package com.practice.leetcode.daily;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n == 1) triangle.get(0).get(0);
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = triangle.get(n-1).get(i);
        for(int i = n-2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                arr[j] = Math.min(arr[j], arr[j+1]) + triangle.get(i).get(j);
            }
        }
        return arr[0];
    }
}
