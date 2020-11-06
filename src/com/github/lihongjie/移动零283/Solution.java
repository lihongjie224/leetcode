package com.github.lihongjie.移动零283;

import java.util.Arrays;

public class Solution {

    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
            i++;
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 0, 4, 0, 12};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }



}
