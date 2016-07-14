/*
 * Print the Fibonacci sequence upto n terms using recursion
 */

package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class FibonacciSequenceUsingRecursion {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.print("Enter the number of terms to print: ");
		n = scn.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(fibonacciSequence(i));	
		}
	}
	
	public static int fibonacciSequence(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacciSequence(n-1)+fibonacciSequence(n-2);
	}
}
