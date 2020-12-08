package com.github.lihongjie.leetcode.删除最外层的括号1021;

public class Solution2 {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();

        int level = 0;
        for (char c: S.toCharArray()) {
            if(c == ')') {
                level --;
            }
            if(level > 0) {
                sb.append(c);
            }
            if(c == '(') {
                level ++;
            }
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(new Solution2().removeOuterParentheses("(()())(())"));
    }

}
