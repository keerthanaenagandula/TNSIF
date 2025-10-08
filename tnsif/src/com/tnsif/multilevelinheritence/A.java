package com.tnsif.multilevelinheritence;

public class A {
	void show1()
	{
		System.out.println("This is class A");
	}
	
}
	class B extends A
	{
	void show2()
	{
	System.out.println(" This is class B extends class A"); 
	}
	}
	class C extends B {
	void show3 ()
	{
	System.out.println("This is class C extends class B"); 
	}
}
