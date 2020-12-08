package com.github.lihongjie.leetcode.两数相加2;

import com.github.lihongjie.ListNode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode hair = new ListNode();
        ListNode head = hair;
        int temp = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 != null?l1.val:0) + (l2 != null? l2.val: 0) + temp;
            temp = sum / 10;
            head.next = new ListNode(sum % 10);
            head = head.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(temp != 0) {
            head.next = new ListNode(temp);
        }
        return hair.next;
    }
}
