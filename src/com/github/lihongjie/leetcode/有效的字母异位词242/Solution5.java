package com.github.lihongjie.leetcode.有效的字母异位词242;

public class Solution5 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charsN = new int[26];

        for (char c: s.toCharArray()) {
            charsN[c - 'a'] ++;
        }
        for (char c: t.toCharArray()) {
            charsN[c - 'a'] --;
            if(charsN[c - 'a'] < 0) {
                return false;
            }
        }

        return true;

    }
}
