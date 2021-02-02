package com.github.lihongjie.leetcode.跳跃游戏55;

public class Solution1 {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i <= maxIndex; i++) {
            maxIndex = Math.max(maxIndex, nums[i] + i);
            if(maxIndex >= nums.length - 1) return true;
        }
        return false;
    }
}
