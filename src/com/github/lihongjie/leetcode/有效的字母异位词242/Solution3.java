package com.github.lihongjie.leetcode.有效的字母异位词242;

import java.util.Arrays;

public class Solution3 {
    public boolean isAnagram(String s, String t) {
        int[] chars = new int[256];

        for (char c: s.toCharArray()) {
            chars[c] ++;
        }
        for (char c: t.toCharArray()) {
            chars[c] --;
        }

        return Arrays.equals(chars, new int[256]);

    }
}
