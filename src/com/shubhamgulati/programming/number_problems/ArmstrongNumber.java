/*
 * Program to find if given number is an Armstrong number or not
 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits
 * is equal to the number itself.
 * For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class ArmstrongNumber {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	}
	
	public static boolean isArmstrong(int num) {
		
		if(numberOfDigits(num) == 3) {
			//find sum of cubes of digits
			int temp = num;
			int sum=0;
			
			while(temp != 0){
				sum = sum + cube(temp%10);
				temp = temp/10;
			}
			
			if(sum == num) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static int numberOfDigits(int num) {
		
		int numberOfDigits=0;
		
		while(num != 0) {
			num = num/10;
			numberOfDigits++;
		}
		return numberOfDigits;
	}
	
	public static int cube(int n) {
		return (n*n*n);
	}
}
