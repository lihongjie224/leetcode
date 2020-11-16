package com.github.lihongjie.leetcode.删除排序数组中的重复项26;

public class Solution4 {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j ++;
            }
        }
        return j + 1;
    }
}
