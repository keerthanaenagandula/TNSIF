package com.tnsif.Interface;

public interface InfDemo {
	
		int a=10; //final and static
		void display();  //abstract method
	}
	class imple implements InfDemo{
		public void display()
		{
			System.out.println("this is implemeting class of Interface");
		}
	}

