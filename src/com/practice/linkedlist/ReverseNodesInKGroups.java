package com.practice.linkedlist;

public class ReverseNodesInKGroups {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode output = null;
        ListNode tail = null;
        ListNode after = head;
        while(after != null){
            ListNode before = after;
            for(int i = 1; i < k && after != null; i++){
                after = after.next;
            }
            if(after == null) {
                tail.next = before;
                return output;
            };
            ListNode nextProcess = after.next;
            after.next = null;
            before = reverse(before);
            if(output == null){
                output = before;
                tail = before;
            }else {
                tail.next = before;
            }
            while(tail.next != null){
                tail = tail.next;
            }
            after = nextProcess;
        }
        return output;
    }
}
