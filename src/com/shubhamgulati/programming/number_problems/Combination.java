/*
 * Calculate the value of npr for given n,r
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class Combination {
	
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n,r,result;
		
		System.out.print("Enter value of n: ");
		n = scn.nextInt();
		System.out.print("Enter the value of r: ");
		r = scn.nextInt();
		
		result = ncr(n,r);
		
		System.out.println("Value of " + n + "c" + r + " is " + result);
	}
	
	public static int ncr(int n, int r) {
		
		return (FactorialOfNumber.factorial(n)/(FactorialOfNumber.factorial(r)*FactorialOfNumber.factorial(n-r)));
		
	}
}
