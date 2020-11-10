package com.github.lihongjie.leetcode.三数之和15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
             if(k > 0 && nums[k - 1] == nums[k]) continue;
             int i = k + 1, j = nums.length - 1;
             while (i < j) {
                 int sum = nums[k] + nums[i] + nums[j];
                 if(sum < 0) {
                    while (i < j && nums[i] == nums[++i]);
                 } else if(sum > 0) {
                    while (i < j && nums[j] == nums[--j]);
                 } else {
                     res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                     while (i < j && nums[i] == nums[++i]);
                     while (i < j && nums[j] == nums[--j]);
                 }
             }
        }
        return res;
    }
}
