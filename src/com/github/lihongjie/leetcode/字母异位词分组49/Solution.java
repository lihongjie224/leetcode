package com.github.lihongjie.leetcode.字母异位词分组49;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String v = String.valueOf(chars);
            if(map.containsKey(v)) {
                map.get(v).add(s);
            } else {
                map.put(v, new ArrayList<>() {{ add(s);}});
            }
        }

        return new ArrayList<>(map.values());

    }
}
