package com.tnsif.Prime;

public class PrimeNum {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count=0;
			int num=4;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(num+" "+"it is a prime number");
			}
			else
			{
				System.out.println(num +" "+"It is not a prime Number");
			}
		}

	}


