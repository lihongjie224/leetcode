package com.github.lihongjie.leetcode.两数相加2;

import com.github.lihongjie.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode hair = new ListNode();
        ListNode res = hair;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + temp;
            temp = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + temp;
            temp = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + temp;
            temp = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;
            l2 = l2.next;
        }

        if(temp != 0) {
            res.next = new ListNode(temp);
        }

        return hair.next;

    }
}
