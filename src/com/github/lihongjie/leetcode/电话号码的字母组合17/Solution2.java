package com.github.lihongjie.leetcode.电话号码的字母组合17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        Map<Character, String> keywords = new HashMap<Character, String>(){{
           put('2', "abc");
           put('3', "def");
           put('4', "ghi");
           put('5', "jkl");
           put('6', "mno");
           put('7', "pqrs");
           put('8', "tuv");
           put('9', "wxyz");
        }};
        List<String> res = new ArrayList<>();

        helper(keywords, "", 0, digits, res);

        return res;
    }

    private void helper(Map<Character, String> keywords, String cur, int n, String digits, List<String> res) {
        if(n == digits.length()) {
            res.add(cur);
            return;
        }

        char[] chars = keywords.get(digits.charAt(n)).toCharArray();
        for (char c: chars) {
            helper(keywords, cur + c, n + 1, digits, res);
        }

    }
}
