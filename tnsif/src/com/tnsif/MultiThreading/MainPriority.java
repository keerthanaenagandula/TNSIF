package com.tnsif.MultiThreading;

public  class MainPriority {
	public static void main (String args[]) {
	PriorityDemo p1 = new PriorityDemo();
	PriorityDemo p2 = new PriorityDemo();
	p1.setPriority(1);
	p2.setPriority(10);
	p1.start();
	p2.start();
}
}



