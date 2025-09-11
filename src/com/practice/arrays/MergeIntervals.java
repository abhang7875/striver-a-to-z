package com.practice.arrays;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0] == 0? b[1] - a[1] : a[0] - b[0]);
        int n = intervals.length, count = 0;
        int start = intervals[0][0], end = intervals[0][1];

        for(int i = 1; i < n; i++) {
            int a = intervals[i][0], b = intervals[i][1];
            if(end >= a) {
                if(end < b) end = b;
            } else {
                intervals[count][0] = start;
                intervals[count][1] = end;
                count++;
                start = a;
                end = b;
            }
        }
        int a = intervals[n-1][0], b = intervals[n-1][1];
        if(end >= a) {
            if(end < b) end = b;
        }
        intervals[count][0] = start;
        intervals[count][1] = end;
        count++;
        int [][] output = new int[count][2];
        for(int i = 0; i < count; i++) {
            output[i][0] = intervals[i][0];
            output[i][1] = intervals[i][1];
        }
        return output;
    }
}
