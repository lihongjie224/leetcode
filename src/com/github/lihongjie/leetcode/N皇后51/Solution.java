package com.github.lihongjie.leetcode.N皇后51;

import java.util.*;

public class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<Set<Integer>> queens = new ArrayList<>();
        Set<Integer> col = new LinkedHashSet<>();
        Set<Integer> pie = new LinkedHashSet<>();
        Set<Integer> na = new LinkedHashSet<>();

        helper(queens, col, pie, na, 0, n);

        return printHelper(queens, n);
    }

    private List<List<String>> printHelper(List<Set<Integer>> queens, int n) {
        List<List<String>> res = new ArrayList<>();
        for (Set<Integer> queen: queens) {
            List<String> temp = new ArrayList<>();
            for(Integer i: queen) {
                char[] chars = new char[n];
                Arrays.fill(chars, '.');
                chars[i] = 'Q';
                temp.add(String.valueOf(chars));
            }
            res.add(temp);
        }
        return res;
    }

    private void helper(List<Set<Integer>> queens, Set<Integer> col, Set<Integer> pie, Set<Integer> na, int cur, int n) {
        if(cur == n) {
            queens.add(new LinkedHashSet<>(col));
            return;
        }
        for (int i = 0; i < n; i++) {
            if(col.contains(i) || pie.contains(cur + i) || na.contains(cur - i)) {
                continue;
            }
            col.add(i);
            pie.add(cur + i);
            na.add(cur - i);
            helper(queens, col, pie, na, cur + 1, n);
            col.remove(i);
            pie.remove(cur + i);
            na.remove(cur - i);
        }
    }
}
