package com.github.lihongjie.leetcode.验证二叉搜索树98;

import com.github.lihongjie.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);

    }


}
