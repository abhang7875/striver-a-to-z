package com.practice.stack.monotonic;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i : asteroids) {
            if (i > 0) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -i) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0)
                    stack.push(i);
                if (stack.peek() == -i)
                    stack.pop();
            }
        }
        int n = stack.size();
        int output[] = new int[n];
        while (!stack.isEmpty()) {
            output[--n] = stack.pop();
        }
        return output;
    }
}
