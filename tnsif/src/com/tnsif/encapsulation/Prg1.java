package com.tnsif.encapsulation;

public class Prg1 {



		protected String color = "Black";
		int seats = 6;
		String company = "Benz";
		
		public void start()
		{
			int a=10;
			System.out.println("The car has started");
		}
		void stop()
		{
			System.out.println("The car has stopped");
		}

	}
	class Hello extends Prg1{
		
		void show()
		{
			System.out.println(color);
		}
	}