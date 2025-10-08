package com.tnsif.Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Dog"); // duplicate not added

        System.out.println("HashSet: " + hashSet);
        System.out.println("HashSet elements:");
        for (String item : hashSet) {
            System.out.println(item);
        }
    }
}
