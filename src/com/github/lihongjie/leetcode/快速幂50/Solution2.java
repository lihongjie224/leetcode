package com.github.lihongjie.leetcode.快速幂50;

public class Solution2 {
    public double myPow(double x, int n) {
        long N = n;
        return N > 0 ? quickPow(x, N) : 1 / quickPow(x, -N);
    }

    private double quickPow(double x, long n) {
        if(n == 0) return 1.0;
        double base = x;
        double res = 1.0;
        while(n > 0) {
            if(n % 2 == 1) {
                res *= base;
            }
            base *= base;
            n /= 2;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().myPow(2, 10));
    }
}
