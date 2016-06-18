/*
 * Program to print numbers from 1-9 and 9-1 without using loop
 */

package com.shubhamgulati.programming;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {
		
		PrintNumbersWithoutLoop pn = new PrintNumbersWithoutLoop();
		
		pn.recursiveAscendingPrint(1);
		
	}
	
	public void recursiveAscendingPrint(int n) {
		if(n<10) {
			System.out.println(n);
			recursiveAscendingPrint(n+1);
		} else {
			recursiveDescendingPrint(9);
		}
	}
	
	public void recursiveDescendingPrint(int n) {
		if(n>0) {
			System.out.println(n);
			recursiveDescendingPrint(n-1);
		}
	}
}
