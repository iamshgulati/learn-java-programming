/*
 * Program to create and print a 2D matrix of 3x3
 */

package com.shubhamgulati.learn_java_programming.number_problems;

public class MatrixTranspose {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int value = 10;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				matrix[i][j] = value;
				value += 10;
			}
		}
		
		System.out.println("Before transpose:");
		printMatrix(matrix);
		
		int temp;
		for(int i=0; i<3; i++){
			for(int j=0; j<i; j++){
				temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		
		System.out.println();
		System.out.println("After transpose:");
		printMatrix(matrix);
	}
	
	protected static void printMatrix(int[][] matrix) {
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
