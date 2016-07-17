package com.shubhamgulati.learn_java_programming.number_problems;

public class AreaOfFigure {
	public static void main(String[] args) {
		System.out.println(getAreaOfCircle(5.5));
		System.out.println(getAreaOfRectangle(4,5));
		System.out.println(getAreaOfSquare(5));
		System.out.println(getAreaOfTriangle(5,6));
	}

	private static double getAreaOfTriangle(int i, int j) {
		return 0.5*i*j;
	}

	private static double getAreaOfSquare(int i) {
		return i*i;
	}

	private static double getAreaOfRectangle(int i, int j) {
		return i*j;
	}

	private static double getAreaOfCircle(double d) {
		return 3.14*d*d;
	}
}
