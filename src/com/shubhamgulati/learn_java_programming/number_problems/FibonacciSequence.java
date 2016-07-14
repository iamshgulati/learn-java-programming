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
		
		int temp = 0;
		int first = -1;
		int second = 1;
		
		System.out.println("Fibonacci sequence upto " + n + " terms:");
		
		for(int i=1; i<n; i++) {
			temp = first + second;
			first = second;
			second = temp;
			System.out.println(temp);
		}
	}
}