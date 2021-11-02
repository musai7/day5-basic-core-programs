package com.day5.functionalprograms;

import java.util.Scanner;

public class BooleanTwoDArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows ");
		int m = sc.nextInt();
		System.out.println("enter number of coloums");
		int n = sc.nextInt();
		boolean[][] booleanArr = new boolean[m][n];
		for (int i = 0; i < booleanArr.length; i++) {
			for (int j = 0; j < booleanArr.length; j++) {
				System.out.print("enter a number in [" + i + "][" + j + "] : ");
				booleanArr[i][j] = sc.nextBoolean();
			}
		}
		for (int i = 0; i < booleanArr.length; i++) {
			for (int j = 0; j < booleanArr.length; j++) {
				System.out.print(booleanArr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
