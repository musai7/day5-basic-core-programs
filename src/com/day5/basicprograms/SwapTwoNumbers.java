package com.day5.basicprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		System.out.println("enter num1 and num2 ");
		Scanner sc = new Scanner(System.in); 
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("before swapping num1 = "+num1+" and num2 = "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping num1 = "+num1+" and num2 = "+num2);
	}

}
