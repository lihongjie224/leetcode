package com.github.lihongjie.leetcode.盛最多水的容器11;

public class Solution8 {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(area, max);
            if(height[left] < height[right]) left ++;
            else right --;
        }

        return max;
    }
}
