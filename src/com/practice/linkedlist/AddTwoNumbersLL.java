package com.practice.linkedlist;

public class AddTwoNumbersLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null ) return l2; if(l2 == null) return l1;
        int sum = l1.val + l2.val;
        int carry = 0;
        if(sum >= 10){
            sum %= 10;
            carry = 1;
        }
        ListNode output = new ListNode(sum);
        ListNode temp = output;
        l1 = l1.next; l2 = l2.next;
        while(l1 != null || l2 != null){
            sum = 0;
            if(l1 != null){ sum += l1.val; l1 = l1.next;}
            if(l2 != null){ sum += l2.val; l2 = l2.next;}
            sum += carry;
            if(sum >= 10){
                sum %= 10;
                carry = 1;
            }else{
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if(carry == 1){
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return output;
    }
}
