package com.github.lihongjie.leetcode.反转链表206;

import com.github.lihongjie.ListNode;

public class Solution6 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null ) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
