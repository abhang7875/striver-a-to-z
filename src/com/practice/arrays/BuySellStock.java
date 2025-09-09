package com.practice.arrays;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int profit = 0, curr = Integer.MAX_VALUE;
        for(int i: prices){
            if(i < curr) curr = i;
            profit = Math.max(i - curr, profit);
        }
        return profit;
    }
}
