package com.github.lihongjie.leetcode.对称二叉树101;

import com.github.lihongjie.TreeNode;

public class Solution1 {

    public boolean isSymmetric(TreeNode root) {

        return check(root, root);

    }

    private boolean check(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;

        if(left == null || right == null) return false;

        if(left.val != right.val) return false;

        return check(left.right, right.left) && check(left.left, right.right);
    }

}
