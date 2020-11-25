package com.github.lihongjie.leetcode.N叉树的后序遍历590;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        process(res, root);
        return res;
    }

    private void process(List<Integer> res, Node root) {
        if(root == null) return;
        for (Node node: root.children) {
            process(res, node);
        }
        res.add(root.val);
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };



}
