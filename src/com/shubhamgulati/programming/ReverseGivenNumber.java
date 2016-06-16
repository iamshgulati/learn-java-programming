/*
 * Reverse a given number
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class ReverseGivenNumber {
	
private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number;
		int reverse = 0;
		
		System.out.print("Enter the number to be reversed: ");
		number = scn.nextInt();
		
		while(number != 0) {
			reverse = reverse*10;
			reverse = reverse + number%10;
			number = number/10;
		}
		
		System.out.println("The reverse is: " + reverse);
	}

}
