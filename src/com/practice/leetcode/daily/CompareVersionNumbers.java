package com.practice.leetcode.daily;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        int v1[] = toInt(version1.split("\\."));
        int v2[] = toInt(version2.split("\\."));
        int n = v1.length, m = v2.length, z = n > m ? n : m;
        for (int i = 0; i < z; i++) {
            int a = i >= n ? 0 : v1[i];
            int b = i >= m ? 0 : v2[i];
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            }
        }
        return 0;
    }

    private int[] toInt(String[] arr) {
        int n = arr.length;
        int output[] = new int[n];
        int i = 0;
        for (String word : arr) {
            int count = 0;
            for (char ch : word.toCharArray()) {
                count = (count * 10) + (ch - '0');
            }
            output[i] = count;
            i++;
        }
        return output;
    }
}
