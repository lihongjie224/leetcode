package com.github.lihongjie.leetcode.删除链表的倒数第N个结点19;

import com.github.lihongjie.ListNode;

public class Solution2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode hair = new ListNode();
        hair.next = head;

        ListNode fast = head, slow = hair;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return hair.next;

    }


}
