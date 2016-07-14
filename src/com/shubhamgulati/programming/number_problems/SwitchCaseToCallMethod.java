/*
 * Program to use switch case to call multiple methods
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class SwitchCaseToCallMethod {

	private static Scanner scn = new Scanner(System.in);
	
	static int a=0, b=0;
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		
		System.out.print("Enter your choice: ");
		choice = scn.nextInt();
		
		switch(choice) {
		
		case 1:
			input(); add(a,b); break;
		case 2:
			input(); substract(a,b); break;
		case 3:
			input(); multiply(a,b); break;
		case 4:
			input(); divide(a,b); break;
		case 5:
			input(); mod(a,b); break;
		default:
			System.out.println("You have entered invalid choice");
		}
	}
	
	public static void input(){
		System.out.print("Enter the first number: ");
		a = scn.nextInt();
		
		System.out.print("Enter the second number: ");
		b = scn.nextInt();
	}
	
	public static void add(int a, int b) {
		System.out.println("Addition of " + a + "," + b + " is " + (a+b));
	}
	
	public static void substract(int a, int b) {
		System.out.println("Substraction of " + a + "," + b + " is " + (a-b));
	}
	
	public static void multiply(int a, int b) {
		System.out.println("Multiplication of " + a + "," + b + " is " + (a*b));
	}
	
	public static void divide(int a, int b) {
		System.out.println("Division of " + a + "," + b + " is " + (a/b));
	}
	
	public static void mod(int a, int b) {
		System.out.println("Modulus of " + a + "," + b + " is " + (a%b));
	}
}
