/*
 * Program to find prime numbers in a given range
 */

package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class PrimeNumbersInRange {
	
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int from,to;
		
		System.out.print("Enter the range from: ");
		from = scn.nextInt();
		System.out.print("Enter the range to: ");
		to = scn.nextInt();
		
		primeNumbersInRange(from,to);
	}
	
	public static void primeNumbersInRange(int from, int to) {
		
		for(int i=from; i<=to; i++) {
			if(PrimeNumber.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
