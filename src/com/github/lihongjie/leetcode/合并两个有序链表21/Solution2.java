package com.github.lihongjie.leetcode.合并两个有序链表21;

import com.github.lihongjie.ListNode;

public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode hair = new ListNode();
        ListNode curr = hair;
        while(l1 != null && l2 != null) {
            while (l1 != null && l2 != null && l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            }
            while (l1 != null && l2 != null && l1.val >= l2.val) {
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }
        }
        curr.next = l1 == null ? l2 : l1;

        return hair.next;
    }
}
