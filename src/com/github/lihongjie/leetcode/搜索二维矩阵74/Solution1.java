package com.github.lihongjie.leetcode.搜索二维矩阵74;

public class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;

        while (i >= 0 && j < matrix[0].length) {
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target) {
                i --;
            } else {
                j ++;
            }
        }

        return false;
    }
}
