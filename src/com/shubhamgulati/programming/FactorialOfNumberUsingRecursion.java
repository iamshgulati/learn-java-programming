/*
 * Find the factorial of given number using recursion
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class FactorialOfNumberUsingRecursion {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Enter a number: ");
		
		int num = scn.nextInt();
		
		int result = factorial(num);
		
		System.out.println("Factorial of " + num + " is " + result);
		
	}
	
	public static int factorial (int num) {
		
		int result = 1;
		
		if (num == 0) {
			return 1;
		}
		
		result = num * factorial(num-1);
		
		return result;
		
	}

}
