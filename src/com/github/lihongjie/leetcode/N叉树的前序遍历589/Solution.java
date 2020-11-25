package com.github.lihongjie.leetcode.N叉树的前序遍历589;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        process(res, root);
        return res;
    }

    private void process(List<Integer> res, Node root) {
        if(root == null) return;
        res.add(root.val);
        for (Node node: root.children) {
            process(res, node);
        }
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
