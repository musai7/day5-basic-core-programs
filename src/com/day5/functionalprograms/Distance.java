package com.day5.functionalprograms;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a x value : ");
		double x=sc.nextInt();
		System.out.println("enter y value ");
		double y=sc.nextInt();
		double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("lengt of the line between points  (0,0) and " +
							"("+ x +"," + y +") Distance : "+distance);
	}
	
}
