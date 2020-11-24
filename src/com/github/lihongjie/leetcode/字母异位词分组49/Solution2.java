package com.github.lihongjie.leetcode.字母异位词分组49;

import java.util.*;

public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        // O(N)
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                map.put(key, new ArrayList<String>(){{add(s);}});
            }

        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }
}
