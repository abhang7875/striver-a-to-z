package com.practice.linkedlist;

public class PallindromeLL {
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow.next);
        slow.next = null;

        while(rev != null) {
            if(rev.val != head.val) return false;
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
}
