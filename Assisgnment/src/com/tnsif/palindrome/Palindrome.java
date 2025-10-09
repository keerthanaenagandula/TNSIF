package com.tnsif.palindrome;
import java.util.Scanner;
public class Palindrome {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int originalNum = num;
	        int reversedNum = 0;

	        // Reverse the number
	        while (num != 0) {
	            int digit = num % 10;              // Get last digit
	            reversedNum = reversedNum * 10 + digit;  // Add digit to reversed number
	            num = num / 10;                    // Remove last digit
	        }

	        // Check if palindrome
	        if (originalNum == reversedNum) {
	            System.out.println(originalNum + " is a Palindrome number.");
	        } else {
	            System.out.println(originalNum + " is NOT a Palindrome number.");
	        }

	        sc.close();
	    }
	}



