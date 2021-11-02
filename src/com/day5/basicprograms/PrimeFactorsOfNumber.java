package com.day5.basicprograms;

import java.util.Scanner;

public class PrimeFactorsOfNumber {

	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = sc.nextInt();

		System.out.print("prime factors of " + num + " are : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						temp++;
					}
				}
			}
			if (temp == 2) {
				System.out.print(" " + i);
			}
			temp = 0;
		}

	}

}
