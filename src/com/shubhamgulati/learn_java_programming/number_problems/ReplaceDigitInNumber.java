/*
 * Replace a digit in a number with a given digit
 */

package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class ReplaceDigitInNumber {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num, target, replacement;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		System.out.print("Enter the target digit: ");
		target = scn.nextInt();
		System.out.print("Enter the replacement digit: ");
		replacement = scn.nextInt();
		
		System.out.println("Original number: " + num);
		System.out.println("Replacing " + target + " with " + replacement);
		System.out.println("New number: " + replace(num, target, replacement));
	}
	
	public static int replace(int num, int target, int replacement) {
		
		int newNum = 0;
		int place = 1;
		while(num != 0) {
			if(num%10 != target) {
				newNum = newNum + (num%10)*place;
			} else {
				newNum = newNum + replacement*place;
			}
			num = num/10;
			place = place*10;
		}
		
		return newNum;
	}
}
