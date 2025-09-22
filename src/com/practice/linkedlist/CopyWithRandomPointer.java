package com.practice.linkedlist;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next, random;

    public Node(int val){
        this.val = val;
    }
}
public class CopyWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> data = new HashMap<>();
        Node curr = head;
        while(curr != null) {
            data.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;

        while(curr != null) {
            Node copy = data.get(curr);
            copy.next = data.get(curr.next);
            copy.random = data.get(curr.random);
            curr = curr.next;
        }
        return data.get(head);
    }
}
