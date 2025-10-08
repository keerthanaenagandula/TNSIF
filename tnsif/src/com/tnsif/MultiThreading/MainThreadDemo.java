package com.tnsif.MultiThreading;

public class MainThreadDemo {

	public static void main(String[] args) {
		ThreadDemo d = new ThreadDemo();
		d.setPriority(1);
		d.start();
		ThreadDemo d1 = new ThreadDemo();
		d1.setPriority(10);
		d1.start();
		
	
	}

}
