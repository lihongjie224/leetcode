package com.github.lihongjie.leetcode.合并两个有序链表21;

import com.github.lihongjie.ListNode;

public class Solution3 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode hair = new ListNode();
        ListNode temp = hair;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        temp.next = l1 == null ? l2 : l1;

        return hair.next;
    }
}
