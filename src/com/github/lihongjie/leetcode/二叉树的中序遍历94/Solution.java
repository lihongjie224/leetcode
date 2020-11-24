package com.github.lihongjie.leetcode.二叉树的中序遍历94;


import com.github.lihongjie.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if(root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

}
