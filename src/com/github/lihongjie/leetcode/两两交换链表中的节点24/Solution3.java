package com.github.lihongjie.leetcode.两两交换链表中的节点24;

import com.github.lihongjie.ListNode;

public class Solution3 {
    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode();
        hair.next = head;
        head = hair;
        while (head.next != null && head.next.next != null) {
            ListNode first = head.next;
            ListNode second = head.next.next;
            head.next = second;
            first.next = second.next;
            second.next = first;
            head = first;
        }
        return hair.next;
    }
}
