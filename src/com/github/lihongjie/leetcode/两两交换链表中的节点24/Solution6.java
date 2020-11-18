package com.github.lihongjie.leetcode.两两交换链表中的节点24;

import com.github.lihongjie.ListNode;

public class Solution6 {
    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode temp = hair;
        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = first.next;
            temp.next = second;
            first.next = second.next;
            second.next = first;
            temp = first;
        }
        return hair.next;
    }
}
