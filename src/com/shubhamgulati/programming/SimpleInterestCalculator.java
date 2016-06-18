/*
 * Program to calculate Simple Interest
 * Inputs are rate, time and principal. Output is SI
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class SimpleInterestCalculator {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float amount, time, rate, interest; 
		
		System.out.println("Java program to calculate Simple interest");
		
		System.out.print("Enter the principal amount: ");
		amount = scn.nextFloat();
		System.out.print("Enter the time in years: ");
		time = scn.nextFloat();
		System.out.print("Enter the annual rate: ");
		rate = scn.nextFloat();
		
		interest = simpleInterest(amount,rate,time);
		
		System.out.println("Simple interest calculated by program is: " + interest);
		
	}
	
	public static float simpleInterest(float principal, float rate, float time) {
		
		float interest = (principal*rate*time)/100;
		
		return interest;
		
	}

}
