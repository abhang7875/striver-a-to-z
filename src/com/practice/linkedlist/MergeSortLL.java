package com.practice.linkedlist;

public class MergeSortLL {
    public ListNode merge(ListNode node1, ListNode node2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
                head.next = node1;
                node1 = node1.next;
            }else{
                head.next = node2;
                node2 = node2.next;
            }
            head = head.next;
        }
        head.next = node1 == null? node2: node1;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(slow.next == null) {
            fast = head.next;
        } else {
            fast = slow.next;
            slow.next = null;
        }
        ListNode left = sortList(head);
        ListNode right = sortList(fast);

        return merge(left, right);
    }
}
