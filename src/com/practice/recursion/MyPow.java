package com.practice.recursion;

public class MyPow {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        if(n == 1) return x;

        double output = 1.0;
        long neg = (long) n;
        if(neg < 0) neg = -neg;

        while(neg > 0) {
            if(neg % 2 == 0) {
                x *= x;
                neg /= 2;
            }else {
                output *= x;
                neg--;
            }
        }

        return n < 0? 1 / output : output;
    }
}
