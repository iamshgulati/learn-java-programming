package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class SumOfOddDigits {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		sumOfEvenOddDigits(num);
	}
	
	public static void sumOfEvenOddDigits(int num) {
		
		int sumOdd=0, sumEven=0;
		int temp = num;
		
		while(temp != 0) {
			
			if((temp%10)%2 != 0) {
				sumOdd = sumOdd + temp%10;
			} else {
				sumEven = sumEven + temp%10;
			}
			
			temp = temp/10;
		}
		
		System.out.println("Sum of even digits in " + num + " is " + sumEven);
		System.out.println("Sum of odd digits in " + num + " is " + sumOdd);
	}
}
