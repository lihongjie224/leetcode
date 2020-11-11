package com.github.lihongjie.leetcode.回文数9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int y = 0;
        while (y < x) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y == x || x == y / 10;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(10));
    }
}
