/*
 * Program to calculate only prime factors of a number
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class PrimeFactorsOfNumber {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		System.out.println("Prime Factors of " + num + " are: ");
		primeFactors(num);
	}
	
	public static void primeFactors(int num) {
		
		for(int i=2; i<=num; i++) {
			if(num%i == 0) {
				if(PrimeNumber.isPrime(i)){
					System.out.println(i);
				}
			}
		}
	}

}
