package com.github.lihongjie.leetcode.二叉树的层序遍历102;

import com.github.lihongjie.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode poll = queue.poll();
                cur.add(poll.val);
                if(poll.left != null) {
                    queue.offer(poll.left);
                }
                if(poll.right != null) {
                    queue.offer(poll.right);
                }
            }

            result.add(0,cur);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Solution2().levelOrder(TreeNode.stringToTreeNode("[3,9,30]")));
    }

}
