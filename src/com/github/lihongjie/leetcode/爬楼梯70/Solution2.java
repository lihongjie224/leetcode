package com.github.lihongjie.leetcode.爬楼梯70;

public class Solution2 {

    public int climbStairs(int n) {
        if(n <= 2) return n;
        int first = 1;
        int second = 2;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }


}
