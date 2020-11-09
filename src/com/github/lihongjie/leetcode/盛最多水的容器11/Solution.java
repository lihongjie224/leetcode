package com.github.lihongjie.leetcode.盛最多水的容器11;

/**
 * 暴力法，双层遍历
 * 时间复杂度 O(n^2)
 */
public class Solution {

    public int maxArea(int[] height) {

        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if(area > max) max = area;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1,2,1};
        System.out.println(new Solution().maxArea(height));
    }

}
