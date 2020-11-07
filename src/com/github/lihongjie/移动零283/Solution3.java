package com.github.lihongjie.移动零283;

import java.util.Arrays;

public class Solution3 {

    public void moveZeroes(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                if(index != i) {
                    nums[i] = 0;
                }
                index ++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 0, 4, 0, 12};
        new Solution3().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }



}
