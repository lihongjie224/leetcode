package com.github.lihongjie.leetcode.有效的字母异位词242;

import java.util.Arrays;

public class Solution4 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charsN = new int[256];
        for (int i = 0; i < s.length(); i++) {
            charsN[s.charAt(i)] ++;
        }
        for (int i = 0; i < t.length(); i++) {
            charsN[t.charAt(i)] --;
            if(charsN[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}
