/*
 * Find the factorial of given number using normal iteration
 */

package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class FactorialOfNumber {
	
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		
		int num = scn.nextInt();
		
		int result = factorial(num);
		
		System.out.println("Factorial of " + num + " is " + result);
	}
	
	public static int factorial (int num) {
		
		int result = 1;
		
		while(num != 0) {
			result = result * num;
			num--;
		}
		
		return result;
	}
}
