package com.tnsif.encapsulation;

public class encap {

	public static void main(String[] args) {
	
		Encapse ob = new Encapse();
		System.out.println(ob.color);
		System.out.println(ob.seats);
		System.out.println(ob.company);
		
		ob.start();
		ob.stop();

	}

}


