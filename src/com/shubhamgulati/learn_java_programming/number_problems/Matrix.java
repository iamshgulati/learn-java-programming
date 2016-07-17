/*
 * Program to create and print a 2D matrix of 3x3
 */

package com.shubhamgulati.learn_java_programming.number_problems;

public class Matrix {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int value = 10;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				matrix[i][j] = value;
				value += 10;
			}
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
