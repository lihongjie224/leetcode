package com.github.lihongjie.leetcode.上升下降字符串1370;

import java.util.Arrays;

public class Solution {
    public String sortString(String s) {
        int[] charsN = new int[26];

        for (char c: s.toCharArray()) {
            charsN[c - 'a'] ++;
        }

        StringBuilder sb = new StringBuilder();

        while (!Arrays.equals(charsN, new int[26])) {
            for (int i = 0; i < charsN.length; i++) {
                if(charsN[i] > 0) {
                    sb.append((char)('a' + i));
                    charsN[i] --;
                }
            }
            for (int i = charsN.length - 1; i >= 0; i--) {
                if(charsN[i] > 0) {
                    sb.append((char)('a' + i));
                    charsN[i] --;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortString("ggggggg"));
    }
}
