package com.github.lihongjie.leetcode.合并两个有序链表21;

import com.github.lihongjie.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode hair = new ListNode();
        ListNode head = hair;
        while (l1 != null && l2 != null) {
            while (l1 != null && l2 != null && l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }
            while (l1 != null && l2 != null && l1.val > l2.val) {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        if(l1 == null) {
            head.next = l2;
        } else {
            head.next = l1;
        }

        return hair.next;
    }
}
