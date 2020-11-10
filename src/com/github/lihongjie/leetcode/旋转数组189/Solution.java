package com.github.lihongjie.leetcode.旋转数组189;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        revese(nums, 0, nums.length - 1);
        revese(nums, 0, k - 1);
        revese(nums, k, nums.length - 1);
    }

    private void revese(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        new Solution().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
