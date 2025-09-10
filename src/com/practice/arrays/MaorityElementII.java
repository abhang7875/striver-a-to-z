package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0;
        for(int n: nums) {
            if(n == num1) {
                count1++;
            } else if(n == num2) {
                count2++;
            } else if(count1 == 0) {
                num1 = n;
                count1 = 1;
            } else if(count2 == 0) {
                num2 = n;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;
        for(int n: nums) {
            if(num1 == n) count1++;
            else if(num2 == n) count2++;
        }
        List<Integer> res = new ArrayList<>();
        int n = nums.length / 3;
        if(count1 > n) res.add(num1);
        if(count2 > n) res.add(num2);

        return res;
    }
}
