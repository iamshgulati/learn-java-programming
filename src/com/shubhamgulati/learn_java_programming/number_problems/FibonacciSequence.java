/*
 * Print the Fibonacci sequence upto n terms
 */

package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class FibonacciSequence {
	
private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.print("Enter the number of terms to print: ");
		n = scn.nextInt();
		
		fibonacciSequence(n);
		
	}
	
	public static void fibonacciSequence(int n) {
		
		int first = -1;
		int second = 1;
		int next = 1;
		
		System.out.println("Fibonacci sequence upto " + n + " terms:");

		for(int i=0; i<n; i++) {
			next = first + second;
			System.out.println(next);
			first = second;
			second = next;
		}
	}
}