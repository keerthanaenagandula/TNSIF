package com.tnsif.Exception;

public class NestedTry {



	public static void main(String[] args) {
		try
		{
			try {
				String n = null;
				System.out.println(n.length());
			}catch(Exception e)
			{
				System.out.println("we cannot read null values");
			}
			finally {
				System.out.println("this is nested try,executed successfully");
			}
			
		}catch(Exception e)
		{
			System.out.println("Outer catch");
		}
	}
}


