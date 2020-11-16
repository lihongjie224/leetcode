package com.github.lihongjie.leetcode.最小栈155;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        stack2.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack1.push(x);
        stack2.push(Math.min(x, stack2.peek()));
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}
