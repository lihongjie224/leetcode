package com.github.lihongjie.leetcode.环形链表141;

import com.github.lihongjie.ListNode;

public class Solution3 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if(fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
