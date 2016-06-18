/*
 * Program to calculate body mass index. Formula of body mass index is weight(KG)/(height(m)*height(m))
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class BodyMassIndexCalculator {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double weight=0.0, height=0.0, bmi=0.0;
		
		System.out.print("Enter weight in KG: ");
		weight = scn.nextDouble();
		System.out.print("Enter height in meters: ");
		height = scn.nextDouble();
		
		bmi = (weight)/(height*height);
		
		System.out.println("Body mass index is: " + bmi);
		
	}

}
