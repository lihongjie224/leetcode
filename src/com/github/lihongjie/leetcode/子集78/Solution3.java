package com.github.lihongjie.leetcode.子集78;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        helper(res, nums, new ArrayList<Integer>(), 0);

        return res;
    }

    private void helper(List<List<Integer>> res, int[] nums, List<Integer> cur, int i) {
        if(i == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        helper(res, nums, cur, i + 1);
        cur.add(nums[i]);
        helper(res, nums, cur, i + 1);

        cur.remove(cur.size() - 1);
    }
}
