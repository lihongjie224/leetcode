package com.github.lihongjie.leetcode.删除最外层的括号1021;

public class Solution {
    public String removeOuterParentheses(String S) {

        int level = 0;
        StringBuilder sb = new StringBuilder();
        for (char c: S.toCharArray()) {
            if(c == ')') level --;
            if(level > 0) {
                sb.append(c);
            }
            if(c == '(') level ++;
        }
        return sb.toString();

    }
}
