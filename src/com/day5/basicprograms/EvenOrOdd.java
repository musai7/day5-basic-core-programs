package com.day5.basicprograms;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("entere a number to check even or odd ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("enterd number is even number :" + num);
		else
			System.out.println("enterd number is odd number :" + num);
	}
}
