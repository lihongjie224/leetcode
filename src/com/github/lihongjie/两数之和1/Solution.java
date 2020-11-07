package com.github.lihongjie.两数之和1;

import java.util.Arrays;

/**
 * 暴力
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 9)));
    }

}
