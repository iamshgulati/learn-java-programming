/*
 * Find LCM of two numbers
 */


package com.shubhamgulati.learn_java_programming.number_problems;

import java.util.Scanner;

public class LCMOfTwoNumbers {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2, max, min, temp, lcm;
		
		System.out.print("Enter the first number: ");
		num1 = scn.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = scn.nextInt();
		
		//find the max and min of the two numbers
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		lcm = 1;
		
		for(int i=1; i<=min; i++) {
			temp = max * i;
			
			if(temp % min == 0) {
				lcm = temp;
				break;
			}
		}
		
		System.out.println("LCM of " + num1 + "," + num2 + " is " + lcm);
		
	}

}
