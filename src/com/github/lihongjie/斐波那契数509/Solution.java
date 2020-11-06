package com.github.lihongjie.斐波那契数509;


public class Solution {
    public int fib(int N) {
        if(N < 2) return N;
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 1; i < N; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().fib(2));
    }
}