package com.practice.linkedlist;

public class IntersectionOfTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while(a != b){
            a = a==null? headB: a.next;
            b = b==null? headA : b.next;
        }
        return a;
    }
}
