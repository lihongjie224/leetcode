package com.github.lihongjie.leetcode.爬楼梯70;

public class Solution {

    public int climbStairs(int n) {
        if(n < 3) return n;
        int first = 1;
        int secode = 2;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = first + secode;
            first = secode;
            secode = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(4));
    }

}
