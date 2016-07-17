/*
 *
 */

package com.shubhamgulati.learn_java_programming.pattern_problems;

import java.util.Scanner;

public class StarsFilledTriangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter height of triangle: ");
		int x = scn.nextInt();
		int y = (2*x)-1;
		
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				if(i>=j && i<=y-i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		scn.close();
	}

}
