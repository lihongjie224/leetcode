package com.github.lihongjie.leetcode.有效的字母异位词242;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            if(map.containsKey(c)) {
                Integer count = map.get(c);
                if(count > 1) {
                    map.put(c, count - 1);
                } else {
                    map.remove(c);
                }

            } else {
                return false;
            }
        }

        return map.isEmpty();

    }
}
