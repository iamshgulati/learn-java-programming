/*
 * Program to find smallest digit in given number
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class SmallestDigitInGivenNumber {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		System.out.println("Smallest digit in "  + num + " is " + findSmallestDigit(num));
	}
	
	public static int findSmallestDigit(int num) {
		
		int smallestDigit = 9;
		while(num != 0) {
			if(smallestDigit > num%10) {
				smallestDigit = num%10;
				if(smallestDigit == 0) {
					break;
				}
			}
			num = num/10;
		}
		
		return smallestDigit;
	}
}
