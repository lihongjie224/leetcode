package com.github.lihongjie.leetcode.斐波那契数509;

public class Solution2 {
    public int fib(int N) {
        if(N < 2) return N;
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 1; i < N; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
