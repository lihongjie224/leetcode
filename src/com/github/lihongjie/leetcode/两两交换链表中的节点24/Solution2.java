package com.github.lihongjie.leetcode.两两交换链表中的节点24;

import com.github.lihongjie.ListNode;

public class Solution2 {
    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode pre = hair;
        ListNode end = null;
        while (head != null && head.next != null) {
            ListNode next = head.next;
            end = next.next;
            next.next = head;
            head.next = end;
            pre.next = next;
            pre = head;
            head = head.next;
        }
        return hair.next;
    }
}
