package com.practice.stack.monotonic;

import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) stack.push(nums[i]);
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int curr = nums[i];
            while (!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }
            if (stack.isEmpty()) output[i] = -1;
            else output[i] = stack.peek();
            stack.push(curr);
        }

        return output;
    }
}
