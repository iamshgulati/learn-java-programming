package com.shubhamgulati.programming;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int randomNumber = 10 + randomGenerator.nextInt(10);
		System.out.println(randomNumber);
	}
}
