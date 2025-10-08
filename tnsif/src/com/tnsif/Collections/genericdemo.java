package com.tnsif.Collections;

public class genericdemo {



	public static void main(String[] args) {
		Generic1<Integer> g = new Generic1<Integer>();
		g.setData(101);
		g.setData(102);
		System.out.println(g.getData());
		
		Generic1<String> g1 = new Generic1<String>();
		g1.setData("TNS PROGRAM");
		System.out.println(g1.getData());

	}

}


