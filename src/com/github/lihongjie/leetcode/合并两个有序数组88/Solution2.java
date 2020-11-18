package com.github.lihongjie.leetcode.合并两个有序数组88;

public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        m --;
        n --;
        while (n >= 0) {
            while (m >= 0 && nums1[m] > nums2[n]) {
                nums1[index--] = nums1[m--];
            }
            nums1[index--] = nums2[n--];
        }
    }
}
