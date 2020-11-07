package com.github.lihongjie.翻转链表206;

/**
 * 1.迭代 head.next -> null, next -> prev, save last
 * 2.递归 reverse(0, 1~last), reverse(1, 2~last), ... reverse(last-1, last)
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
