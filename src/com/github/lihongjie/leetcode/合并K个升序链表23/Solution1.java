package com.github.lihongjie.leetcode.合并K个升序链表23;

import com.github.lihongjie.ListNode;

public class Solution1 {

    public ListNode mergeKLists(ListNode[] lists) {

        return merge(lists, 0, lists.length - 1);

    }

    private ListNode merge(ListNode[] lists, int left, int right) {

        if(left == right) return lists[left];

        if(left > right) return null;

        int mid = (right + left) >> 1;

        return mergeTwoList(merge(lists, left, mid), merge(lists, mid + 1, right));
    }

    private ListNode mergeTwoList(ListNode l1, ListNode l2) {

        ListNode res = new ListNode();

        ListNode cur = res;

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

        if(l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }

        return res.next;
    }


}
