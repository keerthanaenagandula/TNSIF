package com.tnsif.Operators;

	

	public class TypesOfOperators {

		public static void main(String[] args) {

		//1.arithmetic
			
			int a=5,b=10;
			
			System.out.println("Add:"+(a+b));
			System.out.println("Minus:"+(a-b));
			System.out.println("Multiply:"+(a*b));
			System.out.println("Division:"+(a/b));
			System.out.println("Moduls:"+(a%b));
			
			//2.Relational
			
			int c=10,d=21;
			
			System.out.println(c==d);
			System.out.println(c!=d);
			System.out.println(c>d);
			System.out.println(c>=d);
			System.out.println(c<d);
			System.out.println(c<=d);
			
			
			//3.Logical 
			
			System.out.println(c>10 && c<30);
			System.out.println(c<10|| c>20);
			System.out.println(!(c==d));
			
			//4.Assignment 
			
			int n=10;
			
			n+=5;
			n-=2;
			n*=3;
			n/=2;
			n%=5;
			System.out.println(n);

			//5.Unary 
			
			int q=2;
			System.out.println(++q);
			System.out.println(q--);
			System.out.println(q);
			
			
			//6.Ternary 
			
			int number =44;
			
			String result =(number%2==0) ? "Even" : "Odd";
			System.out.println(result);

		}}

