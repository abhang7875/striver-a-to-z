package com.practice.linkedlist;

public class DeleteMiddleNodeLL {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode prev = head;
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev.next != null)
            prev.next = prev.next.next;
        else prev.next = null;

        return head;
    }
}
