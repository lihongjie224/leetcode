package com.github.lihongjie.leetcode.最小栈155;

import java.util.Stack;

public class MinStack3 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack3() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(x, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
