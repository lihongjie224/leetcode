package com.github.lihongjie.leetcode.两两交换链表中的节点24;

import com.github.lihongjie.ListNode;

public class Solution9 {
    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode();
        ListNode curr = hair;
        curr.next = head;

        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = first.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = first;
        }

        return hair.next;

    }
}
