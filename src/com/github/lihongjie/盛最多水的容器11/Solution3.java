package com.github.lihongjie.盛最多水的容器11;

public class Solution3 {

    public int maxArea(int[] height) {
        int i = 0, j=height.length -1, max = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(area, max);
            if(height[i] < height[j]) {
                i ++;
            } else {
                j --;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution3().maxArea(height));
    }

}
