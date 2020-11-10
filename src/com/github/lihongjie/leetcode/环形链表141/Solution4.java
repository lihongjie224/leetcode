package com.github.lihongjie.leetcode.环形链表141;

import com.github.lihongjie.ListNode;

public class Solution4 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
