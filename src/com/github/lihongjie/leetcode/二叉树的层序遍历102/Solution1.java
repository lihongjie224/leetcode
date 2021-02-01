package com.github.lihongjie.leetcode.二叉树的层序遍历102;

import com.github.lihongjie.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        List<TreeNode> currLevel = new ArrayList<>();
        currLevel.add(root);
        while (!currLevel.isEmpty()) {

            List<TreeNode> tmp = new ArrayList<>();
            List<Integer> currResult = new ArrayList<>();

            for (TreeNode treeNode: currLevel) {
                currResult.add(treeNode.val);
                if(treeNode.left != null) {
                    tmp.add(treeNode.left);
                }
                if(treeNode.right != null) {
                    tmp.add(treeNode.right);
                }
            }
            result.add(currResult);
            currLevel = tmp;
        }

        return result;

    }
}
