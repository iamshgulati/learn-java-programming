/*
 * Program to calculate all factors of a number
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class FactorsOfNumber {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		System.out.println("Factors of " + num + " are: ");
		factors(num);
	}
	
	public static void factors(int num) {
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}
	}

}
