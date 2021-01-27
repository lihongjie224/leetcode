package com.github.lihongjie.leetcode.斐波那契数509;

public class Solution4 {
    public int fib(int n) {
        if(n < 2) return n;
        int p = 0,q = 1,sum = 1;
        for (int i = 1; i < n; i++) {
            sum = p + q;
            p = q;
            q = sum;
        }
        return sum;
    }
}
