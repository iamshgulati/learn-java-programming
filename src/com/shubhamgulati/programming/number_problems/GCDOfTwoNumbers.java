/*
 * Find the GCD of two numbers
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2, gcd;
		
		System.out.print("Enter the first number: ");
		num1 = scn.nextInt();
		System.out.print("Enter the second number: ");
		num2 = scn.nextInt();
		
		gcd = findGCD(num1,num2);
		
		System.out.println("GCD of " + num1 + "," + num2 + " is " + gcd);
	}
	
	public static int findGCD(int num1, int num2) {
		
		if(num2==0){
			return num1;
		}
		
		return findGCD(num2, num1%num2);
	}
}
