package com.github.lihongjie.leetcode.子集78;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] nums, int n, List<Integer> cur, List<List<Integer>> res) {
        if(n == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        helper(nums, n + 1, cur, res);
        cur.add(nums[n]);
        helper(nums, n + 1, cur, res);

        cur.remove(cur.size() - 1);
    }


}
