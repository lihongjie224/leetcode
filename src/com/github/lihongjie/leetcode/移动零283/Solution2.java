package com.github.lihongjie.leetcode.移动零283;

import java.util.Arrays;

public class Solution2 {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                if(i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }


    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 0, 4, 0, 12};
        new Solution2().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }



}
