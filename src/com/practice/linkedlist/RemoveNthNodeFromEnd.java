package com.practice.linkedlist;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        int i = 1;
        while (i < n && fast != null) {
            fast = fast.next;
            i++;
        }
        ListNode prev = null;
        while (fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (prev == null) {
            head = head.next;
        } else if (prev.next != null) prev.next = prev.next.next;
        return head;
    }
}
