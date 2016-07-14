/*
 * Reverse a given number
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class ReverseGivenNumber {
	
private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		int reverse = 0;
		
		System.out.print("Enter the number to be reversed: ");
		num = scn.nextInt();
		
		reverse = reverseNumber(num);
		
		System.out.println("The reverse is: " + reverse);
	}
	
	public static int reverseNumber(int num) {
		
		int rev = 0;
		
		while(num != 0) {
			rev = rev*10;
			rev = rev + num%10;
			num = num/10;
		}
		
		return rev;
	}

}
