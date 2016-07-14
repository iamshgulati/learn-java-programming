/*
 * Find the multiples of a given number
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class MultiplesOfNumber {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num, terms;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		System.out.print("Enter the number of multiples required: ");
		terms = scn.nextInt();
		
		System.out.println("Multiples of " + num + " upto " + terms + " terms");
		multiples(num,terms);
	}
	
	public static void multiples(int num, int terms) {
		
		for(int i=0; i<terms; i++) {
			System.out.println(num*(i+1));
		}
	}
	
	
}
