/*
 * Program to find largest digit in given number
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class LargestDigitInGivenNumber {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		System.out.println("Largest digit in "  + num + " is " + findLargestDigit(num));
	}
	
	public static int findLargestDigit(int num) {
		
		int largestDigit = 0;
		while(num != 0) {
			if(largestDigit < num%10) {
				largestDigit = num%10;
				if(largestDigit == 9) {
					break;
				}
			}
			num = num/10;
		}
		
		return largestDigit;
	}
}
