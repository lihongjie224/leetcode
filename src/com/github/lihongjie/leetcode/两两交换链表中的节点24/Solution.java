package com.github.lihongjie.leetcode.两两交换链表中的节点24;

import com.github.lihongjie.ListNode;

public class Solution {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;

        return next;
    }

}