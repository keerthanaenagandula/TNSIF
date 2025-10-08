


package com.tnsif.Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Print elements using toString()
        System.out.println("Vector: " + vector);

        // Alternatively, print elements one by one
        System.out.println("Vector elements:");
        for (String item : vector) {
            System.out.println(item);
        }
    }
}
