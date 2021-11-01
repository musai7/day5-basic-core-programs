package com.day5.basicprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 100);
		System.out.println("number 1 : " + num1);
		int num2 = (int) (Math.random() * 100);
		System.out.println("number 2 : " + num2);
		int num3 = (int) (Math.random() * 100);
		System.out.println("number 3 : " + num3);
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is gtreater than all " + num1);
		} else if (num2 > num3) {
			System.out.println("num2 is gtreater than all " + num2);
		} else
			System.out.println("num3 is gtreater than all " + num3);

	}
}
