package com.github.lihongjie.leetcode.有效的括号20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if ((c == ')' || c == ']' || c == '}') && !stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
