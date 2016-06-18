/*
 * Program to find whether a number is prime or not
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class PrimeNumber {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		boolean isPrime;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		isPrime = isPrime(num);
		
		if(isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
	
	public static boolean isPrime(int num) {
		
		if(num == 1) {
			return false;
		} else {
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num%i == 0) {
					return false;
				}
			}
			
			return true;
		}
	}
}
