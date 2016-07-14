/*
 * Find is a given number is palindrome
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class Palindrome {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		boolean isPalindrome;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		isPalindrome = isPalindrome(num);
		
		if(isPalindrome) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + " is not a palindrome");
		}
	}
	
	public static boolean isPalindrome(int num) {
		
		int rev;
		
		rev = ReverseGivenNumber.reverseNumber(num);
		
		if(num == rev) {
			return true;
		} else {
			return false;
		}
		
	}
}
