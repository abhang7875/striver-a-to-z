package com.practice.stack.monotonic;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int output = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                output += (leftMax - height[left]);
                left++;
            }else {
                rightMax = Math.max(rightMax, height[right]);
                output += (rightMax - height[right]);
                right--;
            }
        }
        return output;
    }
}
