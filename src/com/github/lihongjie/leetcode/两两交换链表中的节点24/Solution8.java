package com.github.lihongjie.leetcode.两两交换链表中的节点24;

import com.github.lihongjie.ListNode;

public class Solution8 {
    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode curr = hair;

        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            curr.next = second;
            curr = first;
        }

        return hair.next;
    }
}
