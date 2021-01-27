package com.github.lihongjie.leetcode.移动零283;

public class Solution7 {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if(nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow ++;
            }
            fast ++;
        }
    }
}
