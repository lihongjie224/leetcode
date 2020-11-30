package com.github.lihongjie.leetcode.快速幂50;

public class Solution {
    public double myPow(double x, int n) {

        long N = n;
        return N > 0 ? quickPow(x, N) : 1 / quickPow(x, -N);

    }

    public double quickPow(double x, long n) {

        if(n == 0) return 1.0;

        double pow = quickPow(x, n / 2);
        if (n % 2 == 1) {
            return pow * pow * x;
        } else {
            return pow * pow;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2, -10));
    }
}
