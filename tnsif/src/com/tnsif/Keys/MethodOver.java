package com.tnsif.Keys;

public class MethodOver {
	
		public void demo() {
			System.out.println("this is default");
		}
		public void demo(int a) {
			System.out.println("this is having one parameter"+a);
		}
		public void demo(int a,int b) {
			System.out.println("value of a is :"+a +"the value of b is : "+b);
	}
		public void show()
		{
			System.out.println("This is parent class");
		}
	}
	class Child extends MethodOver{
		public void show()
		{
			System.out.println("This is child class");
		}
		
	}


