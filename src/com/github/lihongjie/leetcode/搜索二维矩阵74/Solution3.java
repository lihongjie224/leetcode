package com.github.lihongjie.leetcode.搜索二维矩阵74;

public class Solution3 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, left = 0, right = m * n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int cur = matrix[mid / n][mid % n];
            if(cur == target) return true;

            if(cur < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }


}
