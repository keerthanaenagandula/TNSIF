package com.tnsif.Collections;





import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(101);
		al.add("nikith");
		al.add(89.3); 
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(0));
		al.add("keerthana");
		al.add(null);
		al.add(101);
		System.out.println(al);

	}

}


