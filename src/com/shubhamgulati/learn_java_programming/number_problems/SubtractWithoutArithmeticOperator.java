/*
 * Program to subtract two numbers without "-" arithmetic operator
 */

package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class SubtractWithoutArithmeticOperator {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a,b;
		
		System.out.print("Enter first number: ");
		a = scn.nextInt();
		System.out.print("Enter second number: ");
		b = scn.nextInt();
		
		System.out.println("Subtraction of " + a + "," + b + " is " + subtract(a,b));
	}

	public static int subtract(int a, int b) {
		
		if(b==0) {
			return a;
		}
		
		int sub = a^b; //Subtraction of two integers is a XOR b
		int carry = (~a&b) << 1; //carry of two integers is complement of a AND b
		
		return subtract(sub, carry);
	}
	
	

}
