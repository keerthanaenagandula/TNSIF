package com.tnsif.Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList: " + linkedList);
        System.out.println("LinkedList elements:");
        for (Integer number : linkedList) {
            System.out.println(number);
        }
    }
}

