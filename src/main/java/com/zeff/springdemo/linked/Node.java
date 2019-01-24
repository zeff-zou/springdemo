package com.zeff.springdemo.linked;

public class Node {

    private final Object value;
    private Node next;

    public Node(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void printLinked(Node head){
        while (head !=null){
            System.out.print(head.getValue());
            System.out.print(" ");
            head = head.getNext();
        }
        System.out.println();
    }
}
