/*
 * Simple program to display exam results (suject marks, average marks and grade)
 */

package com.shubhamgulati.programming;

import java.util.Scanner;

public class ExamResults {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name;
		float average;
		String grade;
		
		System.out.print("Enter a student name: ");
		name = scn.nextLine();
		
		average = calculateAverage();
		grade = calculateGrade(average);
		
		System.out.println("--------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Average: " + average);
		System.out.println("--------------------------------");
		
	}
	
	public static float calculateAverage() {
		float marks;
		float sum = 0;
		float average = 0;
		
		System.out.println("Enter marks for five subjects");
		
		for(int i=0; i<5; i++){
			marks = scn.nextFloat();
			sum = sum + marks;
		}
		
		average = sum/5;
		
		return average;
	}
	
	public static String calculateGrade(double average) {
		String grade = "";
		if(average >= 90 && average <= 100) {
			grade = "A";
		} else if(average >= 80 && average <=89) {
			grade = "B";
		} else if(average >= 70 && average <=79) {
			grade = "C";
		} else if(average >= 60 && average <=69) {
			grade = "D";
		} else if(average >= 0 && average <=59) {
			grade = "F";
		}
		
		return grade;
	}
}
