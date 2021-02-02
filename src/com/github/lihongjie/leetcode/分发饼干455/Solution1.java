package com.github.lihongjie.leetcode.分发饼干455;

import java.util.Arrays;

public class Solution1 {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, count = 0;
        while (i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                count ++;
                i ++;
            }
            j ++;
        }
        return count;
    }
}
