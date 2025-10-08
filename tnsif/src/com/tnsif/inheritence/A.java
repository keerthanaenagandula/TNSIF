package com.tnsif.inheritence;



public class A {
	public void show1()
	{
		System.out.println("This is class A");
	}
}

class Bb extends A{
	public void show2()
	{
		System.out.println("This is class B extends from Class A");
	}
}

class C extends Bb{
	public void show3()
	{
		System.out.println("This is class C extends from Class B");
	}
}