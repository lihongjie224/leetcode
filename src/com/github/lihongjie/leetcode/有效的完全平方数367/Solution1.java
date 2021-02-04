package com.github.lihongjie.leetcode.有效的完全平方数367;

public class Solution1 {
    public boolean isPerfectSquare(int num) {

        if(num < 2) return true;

        long left = 2, right = num/2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long pow = mid * mid;
            if(pow == num) {
                return true;
            } else if (pow < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return false;

    }
}
