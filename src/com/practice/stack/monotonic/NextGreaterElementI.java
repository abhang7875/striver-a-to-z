package com.practice.stack.monotonic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> data = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int m = nums1.length, n = nums2.length;

        for(int i = 0; i < n; i++) {
            int curr = nums2[i];
            while(!stack.isEmpty() && stack.peek() < curr) {
                data.put(stack.pop(), curr);
            }
            stack.add(curr);
        }
        int output[] = new int[m];
        for(int i = 0; i < m; i++) {
            output[i] = data.getOrDefault(nums1[i], -1);
        }
        return output;
    }
}
