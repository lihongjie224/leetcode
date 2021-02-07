package com.github.lihongjie.leetcode.有效的完全平方数367;

public class Solution2 {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        int min = 2, max = num / 2;
        while (min <= num) {
            int mid = min + (max - min) / 2;
            int pow = mid * mid;
            if(pow == num) return true;

            if(pow < num) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }

        }
        return false;
    }
}
