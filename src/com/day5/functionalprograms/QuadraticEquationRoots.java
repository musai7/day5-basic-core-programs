package com.day5.functionalprograms;

import java.util.Scanner;

public class QuadraticEquationRoots {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a,b,c values ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("quadratic equation is : "+a+"x^2+"+b+"x+"+c+"=0");
		int delta=(b*b-(4*a*c));
		double root1=(-b+Math.sqrt(delta))/(2*a);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("quadratic equation roots are---> root1 : "+root1+" root2 : "+root2);
	}

}
