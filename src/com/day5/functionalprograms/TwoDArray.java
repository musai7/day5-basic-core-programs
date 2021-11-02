package com.day5.functionalprograms;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows ");
		int m = sc.nextInt();
		System.out.println("enter number of coloums ");
		int n = sc.nextInt();
		int twoDArr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("enter a number in [" + i + "][" + j + "]");
				twoDArr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.println();

			for (int j = 0; j < n; j++) {
				System.out.print(twoDArr[i][j]+" ");
			}
		}
	}

}
