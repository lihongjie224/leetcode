package com.github.lihongjie.leetcode.合并K个升序链表23;

import com.github.lihongjie.ListNode;

public class Solution2 {

    public ListNode mergeKLists(ListNode[] lists) {

        return merge(lists, 0, lists.length - 1);

    }

    private ListNode merge(ListNode[] lists, int left, int right) {

        if(left == right) return lists[left];

        if(left > right) return null;

        int mid = (left + right) >> 1;

        return mergeTwoLists(merge(lists, left, mid), merge(lists, mid + 1, right));
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode hair = new ListNode();
        ListNode cur = hair;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 == null ? l2 : l1;

        return hair.next;
    }


}
