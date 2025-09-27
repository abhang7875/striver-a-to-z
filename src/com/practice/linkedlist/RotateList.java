package com.practice.linkedlist;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        k %= n;
        if (k == 0) return head;
        ListNode first = head;
        for (int i = 1; i < n - k; i++) {
            first = first.next;
        }
        ListNode second = first.next;
        curr = second;
        first.next = null;
        while (curr.next != null) curr = curr.next;
        curr.next = head;
        return second;
    }
}
