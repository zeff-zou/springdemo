package com.zeff.springdemo.linked;

public class LinkedListReverse {

    //通过递归反转
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

    //通过循环反转null
    public static Node loopReverse(Node head){
        Node newHead = null;
        Node curHead = head;

        while (curHead != null){
            Node next = curHead.getNext();
            curHead.setNext(newHead);
            newHead = curHead;
            curHead = next;
        }
        return newHead;
    }
}
