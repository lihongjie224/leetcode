package com.github.lihongjie.leetcode.搜索二维矩阵74;

public class Solution4 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int left = 0, right = m * n - 1;


        while (left < right) {
            int mid = (left + right) >> 1;
            int cur = matrix[mid / n][mid % n];

            if(target == cur) return true;

            if(target < cur) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return false;

    }


}
