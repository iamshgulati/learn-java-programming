/*
 * Program to convert decimal number equivalent binary number
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class DecimalToBinary {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int decimalNumber;
		
		System.out.print("Enter a decimal number: ");
		decimalNumber = scn.nextInt();
		
		System.out.println(decimalNumber + " in binary representation is " + decimalToBinary(decimalNumber));
	}
	
	public static String decimalToBinary(int decimalNumber) {
		
		String binaryNumber = "";
		
		while(decimalNumber != 0) {
			binaryNumber = binaryNumber + (decimalNumber%2);
			decimalNumber = decimalNumber/2;
		}
		
		return binaryNumber;
	}
}
