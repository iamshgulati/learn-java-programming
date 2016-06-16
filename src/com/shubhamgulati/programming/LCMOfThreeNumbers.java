/*
 * Find the LCM of three numbers
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class LCMOfThreeNumbers {
	
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2, num3, lcm;
		
		System.out.print("Enter the first number: ");
		num1 = scn.nextInt();
		System.out.print("Enter the second number: ");
		num2 = scn.nextInt();
		System.out.print("Enter the third number: ");
		num3 = scn.nextInt();
		
		lcm = 1;
		
		for(int i=2; i<=num1*num2*num3; i++) {
			if(i%num1==0 && i%num2==0 && i%num3==0) {
				lcm = i;
				break;
			}
		}
		
		System.out.println("LCM of " + num1 + "," + num2 + "," + num3 + " is " + lcm);
	}

}
