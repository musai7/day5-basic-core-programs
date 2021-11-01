package com.day5.basicprograms;

import java.util.Scanner;

public class NthHormincNumber {
	public static void main(String[] args) {
		double hormonicsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number btw 1-100 ");
		int num=sc.nextInt();
		System.out.print("sum of "+num+"th hormonic progresion is : ");
		for(int i=1;i<=num;i++) {
			hormonicsum+=1.0/i;
			System.out.print("1/"+i);
			if(i<num)
				System.out.print("+");
		}
		System.out.println("="+hormonicsum);
		
	}
}
