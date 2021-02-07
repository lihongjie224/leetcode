package com.github.lihongjie.leetcode.搜索二维矩阵74;

public class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;

        while (i >= 0 && j < matrix[0].length) {
            int cur = matrix[i][j];
            if(cur == target) return true;
            if(cur < target) {
                j ++;
            } else {
                i --;
            }
        }
        return false;

    }
}
