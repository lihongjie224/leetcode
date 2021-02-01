package com.github.lihongjie.leetcode.电话号码的字母组合17;

import java.util.*;

public class Solution3 {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return new ArrayList<>();

        Map<Character, String> keys = new HashMap<Character, String>() {{
           put('2', "abc");
           put('3', "def");
           put('4', "ghi");
           put('5', "jkl");
           put('6', "mno");
           put('7', "pqrs");
           put('8', "tuv");
           put('9', "wxyz");
        }};

        List<String> results = new ArrayList<>();

        dfs(results, keys, digits, 0, "");

        return results;
    }

    private void dfs(List<String> results, Map<Character, String> keys, String digits, int level, String cur) {
        if(level == digits.length()) {
            results.add(cur);
            return;
        }
        char c = digits.charAt(level);
        for (int i = 0; i < keys.get(c).length(); i++) {
            dfs(results, keys, digits, level+1, cur+keys.get(c).charAt(i) );
        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution3().letterCombinations("23"));
    }


}
