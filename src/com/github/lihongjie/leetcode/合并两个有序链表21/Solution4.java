package com.github.lihongjie.leetcode.合并两个有序链表21;

import com.github.lihongjie.ListNode;

public class Solution4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode hair = new ListNode();
        ListNode curr = hair;
        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = l1 == null ? l2 : null;

        return hair.next;
    }
}
