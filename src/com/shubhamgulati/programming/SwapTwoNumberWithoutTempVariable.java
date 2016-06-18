/*
 * Program to swap two numbers without temp variable
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class SwapTwoNumberWithoutTempVariable {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a,b;
		
		System.out.print("Enter first number: ");
		a = scn.nextInt();
		System.out.print("Enter second number: ");
		b = scn.nextInt();
		
		System.out.println("a = " + a + " b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping: ");
		System.out.println("a = " + a + " b = " + b);
	}
}
