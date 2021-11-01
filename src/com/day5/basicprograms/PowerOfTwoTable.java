package com.day5.basicprograms;

import java.util.Scanner;

public class PowerOfTwoTable {
	public static void main(String[] args) {
		
		int powerTable=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i>0) {
				powerTable*=2;
				System.out.println("2^"+i+" = "+powerTable);
			}
			else
				System.out.println("2^0 = 0");
		}
		//System.out.println();
	}

}
