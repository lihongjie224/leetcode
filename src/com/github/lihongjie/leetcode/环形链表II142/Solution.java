package com.github.lihongjie.leetcode.环形链表II142;

import com.github.lihongjie.ListNode;

// 先判断是否有环，然后数环的长度n，快慢指针从头开始跑，快指针比慢指针快n，当相遇时慢指针就是环
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if(fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow此时在环的起始位置
        fast = slow.next;
        int n = 1;
        while (fast != slow) {
            fast = fast.next;
            n ++;
        }

        //从头跑
        fast = head;
        slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;

    }
}
