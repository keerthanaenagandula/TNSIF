package com.tnsif.LamdaExpression;

public class ParaDemo {

	public static void main(String[] args) {


		WithPara w = (a) ->
		{
			System.out.println("The value of a is :" +a);
			return a;	
		};
		
		w.hello(5);

	}

}


	


