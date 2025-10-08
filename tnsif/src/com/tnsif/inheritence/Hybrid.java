package com.tnsif.inheritence;

public class Hybrid {


	public void prepare() {
		System.out.println("Hello This is a Hybrid Inheritance..");
	}
}

class HelloWorld1 extends Hybrid{
	public void prepare1() {
		System.out.println("Hello this is from Multilevel Inheritance class from Parent class");
	}
	
}

class A extends Hybrid{
	public void printing()
	{
		System.out.println("Hello This is a Multilevel Inheritance from printing method..");

	}
}

class B extends A{
	public void printing1() {
		System.out.println("Hello This is a Multilevel Inheritance from printing1 method ..");

	}
}

