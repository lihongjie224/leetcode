package com.github.lihongjie.leetcode.x的平方根69;

public class Solution2 {
    public int mySqrt(int x) {
        int left = 0, right = x, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(mid * mid <= x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
