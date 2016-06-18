/*
 * Program to find the Strong number
 * Strong number is a number which is equal to the sum of the factorials of its digits
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class StrongNumber {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		int temp, mod, sum=0;
		
		System.out.print("Enter a number to find if it is a strong number: ");
		num = scn.nextInt();
		
		temp = num;
		
		while(temp > 0) {
			mod = temp%10;
			sum = sum + FactorialOfNumber.factorial(mod);
			temp = temp/10;
		}
		
		if(num == sum) {
			System.out.println(num + " is a strong number");
		} else {
			System.out.println(num + " is not a strong number");
		}
		
	}
}
