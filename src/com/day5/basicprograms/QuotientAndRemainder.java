package com.day5.basicprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		System.out.println("enter a dividend number ");
		Scanner sc =new Scanner(System.in);
		int dividend =sc.nextInt();
		System.out.println("enter a divider number ");
		int divider =sc.nextInt();
		int quotient=dividend/divider;
		int remainder=dividend%divider;
			
		System.out.println("the quotient is "+quotient+" and the remainder is "+remainder);
	}

}
