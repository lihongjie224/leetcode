package com.github.lihongjie.剑指offer.链表中倒数第k个节点22;

import com.github.lihongjie.ListNode;

public class Solution2 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
