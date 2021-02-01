package com.github.lihongjie.leetcode.电话号码的字母组合17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        Map<Character, String> map = new HashMap<Character, String>(){{
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

        helper(map, "", 0, digits.toCharArray(), res);

        return res;
    }

    private void helper(Map<Character, String> map, String curr, int i, char[] digits, List<String> res) {
        if(i == digits.length) {
            res.add(curr);
            return;
        }

        char[] chars = map.get(digits[i]).toCharArray();
        for (char c: chars) {
            helper(map, curr + c, i+1, digits, res);
        }
    }


}
