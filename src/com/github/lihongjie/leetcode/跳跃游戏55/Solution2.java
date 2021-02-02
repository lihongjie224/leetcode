package com.github.lihongjie.leetcode.跳跃游戏55;

public class Solution2 {
    public boolean canJump(int[] nums) {
        int minIndex = nums.length - 1;
        for (int i = minIndex; i >= 0; i--) {
            if(nums[i] + i >= minIndex) {
                minIndex = i;
            }
        }
        return minIndex == 0;
    }
}
