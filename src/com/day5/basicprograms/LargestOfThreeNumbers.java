package com.day5.basicprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		System.out.println("enter three numbers num1 num2 num3 ");
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is gtreater than all "+num1);
		}
		else if(num2>num3) {
			System.out.println("num2 is gtreater than all "+num2);
		}
		else
			System.out.println("num3 is gtreater than all "+num3);
		
	}
}
