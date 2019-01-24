package com.zeff.springdemo.linked;

public class LinkedListReverse {

    public static Node reverse(Node head){
        if (head == null){
            return null;
        }

        if (head.getNext() == null){
            return head;
        }
        Node newHead = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }
}
