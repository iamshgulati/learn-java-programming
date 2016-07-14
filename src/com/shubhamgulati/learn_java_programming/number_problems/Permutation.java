/*
 * Calculate the value of npr for given n,r
 */

package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class Permutation {
	
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n,r,result;
		
		System.out.print("Enter value of n: ");
		n = scn.nextInt();
		System.out.print("Enter the value of r: ");
		r = scn.nextInt();
		
		result = npr(n,r);
		
		System.out.println("Value of " + n + "p" + r + " is " + result);
	}
	
	public static int npr(int n, int r) {
		
		return (FactorialOfNumber.factorial(n)/FactorialOfNumber.factorial(n-r));
		
	}
}
