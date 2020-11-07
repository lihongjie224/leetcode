package com.github.lihongjie.三数之和15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2 && nums[k] <= 0; k++) {
            if(k > 0 && nums[k] == nums[k-1]) continue;
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
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

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4,-3, 3, 0};
        System.out.println(new Solution().threeSum(nums));
    }

}
