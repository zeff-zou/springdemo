package com.zeff.springdemo.linked;

public class LinkedListDelete {

    public static Node delete(Node node,Object value){
        Node newNode = node;

        while (node != null && node.getNext() != null){
            Node next = node.getNext();
            if (next.getValue().equals(value)){
                node.setNext(next.getNext());
                next = next.getNext();
            }else if (node.getValue().equals(value)){
                newNode = next;
            }
            node = next;
        }

        return newNode;
    }

}
