package con.tnsif.Wrapper;

public class WrapperDemo {





	public static void main(String[] args) {
		
		int num=10;
		Integer obj =num;
		System.out.println("Auto boxing Example 1:int to Integer ="+obj);
		
		char c='S';
		Character obj1=c;
		System.out.println("Auto boxing Example 2:char to Character ="+obj1);
		
		double db =244.823;
		Double obj2=db;
		System.out.println("Auto boxing Example 3:double to Double ="+obj2);

		
		Integer obj3= 1234;
		int num1=obj3;
		System.out.println("Auto unboxing Example 1:Integer to int ="+num1);

		Character obj4='A';
		char c1=obj4;
		System.out.println("Auto unboxing Example 2:Character to char ="+obj4);
		
		Double obj5=582.21;
		double db1=obj5;
		System.out.println("Auto unboxing Example 3:Double to double ="+db1);


		
	}

}



