package com.github.lihongjie.leetcode.多数元素169;

public class Solution2 {
    public int majorityElement(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private int helper(int[] nums, int low, int high) {

        if(low == high) {
            return nums[low];
        }

        int mid = (high - low) / 2 + low;
        int left = helper(nums, low, mid);
        int right = helper(nums, mid + 1, high);

        if(left == right) {
            return left;
        }

        int leftCount = count(nums, low, mid, left);
        int rightCount = count(nums, mid, high, right);

        return leftCount > rightCount ? left : right;

    }

    private int count(int[] nums, int low, int high, int n) {
        int count = 0;
        while (low < high) {
            if(nums[low] == n) {
                count ++;
            }
            low ++;
        }
        return count;
    }


}
