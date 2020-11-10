package com.github.lihongjie.leetcode.盛最多水的容器11;

public class Solution5 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);
            if(height[i] < height[j]) {
                i ++;
            } else {
                j--;
            }
        }
        return max;
    }
}
