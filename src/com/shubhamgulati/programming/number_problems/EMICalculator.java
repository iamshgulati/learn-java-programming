/*
 * Program to calculate EMI a customer has to pay for the taken loan amount
 */

package com.shubhamgulati.programming.number_problems;

import java.util.Scanner;

public class EMICalculator {
	
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double loanAmount;
		double interestRate;
		int installments;
		double emi;
		
		System.out.print("Enter loan amount: ");
		loanAmount = scn.nextDouble();
		System.out.print("Enter interest rate: ");
		interestRate = scn.nextDouble();
		System.out.print("Enter number of installments: ");
		installments = scn.nextInt();
		
		emi = calculateEMI(loanAmount,interestRate,installments);
		
		System.out.println("EMI is: " + emi);
		
	}
	
	public static double calculateEMI(double loanAmount, double interestRate, int installments) {
		
		double monthlyInterestRate = (interestRate/12)/100;
		double emi = (loanAmount * monthlyInterestRate * (Math.pow(1+monthlyInterestRate, installments))/(Math.pow(1+monthlyInterestRate, installments-1)));
		
		return emi;
		
	}

}
