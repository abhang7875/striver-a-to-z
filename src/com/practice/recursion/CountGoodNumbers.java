package com.practice.recursion;

public class CountGoodNumbers {
    long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long a = myPow(5, even), b = myPow(4, odd);

        return (int) ((a * b) % MOD);
    }

    private long myPow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b = b >> 1;
        }
        return res % MOD;
    }
}
