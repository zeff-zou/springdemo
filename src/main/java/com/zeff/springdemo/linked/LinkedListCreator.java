package com.zeff.springdemo.linked;

import java.util.List;

public class LinkedListCreator {

    public static Node createLinkedList(List<Object> data){
        if (data == null || data.isEmpty()){
            return null;
        }
        Node firstNode = new Node(data.get(0));
        Node headNode = createLinkedList(data.subList(1, data.size()));
        firstNode.setNext(headNode);
        return firstNode;
    }

}
