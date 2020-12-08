package com.github.lihongjie.leetcode.快速幂50;

public class Solution3 {
    public double myPow(double x, int n) {



        return n > 0 ? pow(x, n) : 1 / pow(x, -n);
    }

    private double pow(double x, long n) {

        if(n == 0) return 1.0;

        double pow = pow(x, n / 2);

        if(n % 2 == 0) {
            return pow * pow;
        } else {
            return pow * pow * x;
        }

    }

}
