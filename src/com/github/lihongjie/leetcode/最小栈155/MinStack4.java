package com.github.lihongjie.leetcode.最小栈155;

import java.util.Stack;

public class MinStack4 {

    Stack<Integer> stack;
    Stack<Integer> min;


    public MinStack4() {
        stack = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        if(min.peek() >= x) {
            min.push(x);
        }
    }

    public void pop() {
        if(stack.peek().equals(min.peek())) {
            min.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
