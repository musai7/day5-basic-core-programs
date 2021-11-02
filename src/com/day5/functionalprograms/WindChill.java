package com.day5.functionalprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature reading in Fahrenheit : ");
		int temp = sc.nextInt();
		System.out.println("enter velocity reading in mile/hr : ");
		int vel = sc.nextInt();
		if (temp <= 50 && vel >= 3 && vel <= 120) {
			double windChill =( 35.74 + .6215 * temp + (.4275 * temp - 35.75) * Math.pow(vel, 0.16));
			System.out.println(windChill);
		}
		else 
			System.out.println("invalid readings");
	}
}
