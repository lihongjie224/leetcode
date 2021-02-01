package com.github.lihongjie.leetcode.最小栈155;

import java.util.Stack;

public class MinStack5 {

    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack5() {
        stack = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        min.push(Math.min(x, min.peek()));
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
