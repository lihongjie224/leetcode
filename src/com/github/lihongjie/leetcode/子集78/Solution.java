package com.github.lihongjie.leetcode.子集78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        sub(res, cur, nums, 0);
        return res;
    }

    private void sub(List<List<Integer>> res, List<Integer> cur, int[] nums, int i) {

        //结束条件
        if(i == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        sub(res, cur, nums, i + 1);
        cur.add(nums[i]);
        sub(res, cur, nums, i + 1);


        cur.remove(cur.size() - 1);


    }

    public static void main(String[] args) {
        System.out.println(new Solution().subsets(new int[]{1, 2, 3}));
    }

}
