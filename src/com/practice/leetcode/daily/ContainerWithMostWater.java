package com.practice.leetcode.daily;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int output = 0;

        while (right > left) {
            int min = Math.min(height[right], height[left]);
            int length = right - left;
            if (min * length > output) output = min * length;

            while (right > left && height[right] <= min) right--;
            while (right > left && height[left] <= min) left++;
        }
        return output;

    }
}
