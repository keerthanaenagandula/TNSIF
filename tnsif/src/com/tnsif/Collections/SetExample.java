
	package com.tnsif.Collections;

	import java.util.Set;
	import java.util.HashSet;

	public class SetExample {
	    public static void main(String[] args) {
	        Set<String> set = new HashSet<>();
	        set.add("Red");
	        set.add("Green");
	        set.add("Blue");

	        System.out.println("Set: " + set);
	        System.out.println("Set elements:");
	        for (String item : set) {
	            System.out.println(item);
	        }
	    }
	}



