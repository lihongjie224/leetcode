package com.github.lihongjie.leetcode.盛最多水的容器11;

/**
 * 双指针
 * 时间复杂度：O(n)
 */
public class Solution2 {

    public int maxArea(int[] height) {

        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i != j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            if(area > max) max = area;
            if(height[i] > height[j]) {
                j --;
            } else {
                i ++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution2().maxArea(height));
    }

}
