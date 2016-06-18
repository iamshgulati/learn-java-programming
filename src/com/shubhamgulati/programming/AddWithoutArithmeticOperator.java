/*
 * Program to add two numbers without arithmetic operator "+"
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class AddWithoutArithmeticOperator {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a,b;
		
		System.out.print("Enter first number: ");
		a = scn.nextInt();
		System.out.print("Enter second number: ");
		b = scn.nextInt();
		
		System.out.println("Sum of " + a + "," + b + " is " + add(a,b));
	}
	
	public static int add(int a, int b) {
		
		if(b==0) {
			return a;
		}
		
		int sum = a^b; //sum of two integers is a XOR b
		int carry = (a&b) << 1; //carry of two integers is a AND b
		
		return add(sum, carry);
		
	}
}
