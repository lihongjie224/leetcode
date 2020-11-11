package com.github.lihongjie.leetcode.反转链表206;

import com.github.lihongjie.ListNode;

public class Solution4 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
