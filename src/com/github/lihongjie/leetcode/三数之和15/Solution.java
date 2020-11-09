package com.github.lihongjie.leetcode.三数之和15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 双指针
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int k = 0;
        while (k < nums.length && nums[k] <= 0) {
            if(k > 0 && nums[k] == nums[k-1]) {
                k ++;
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                if(i > k + 1 && nums[i] == nums[i-1]) {
                    i ++;
                    continue;
                }
                if(j < nums.length - 1 && nums[j] == nums[j+1]) {
                    j --;
                    continue;
                }
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0) {
                    i ++;
                } else if(sum > 0) {
                    j --;
                } else {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i ++;
                    j --;
                }
            }
            k ++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
        System.out.println(new Solution().threeSum(nums));
    }

}
