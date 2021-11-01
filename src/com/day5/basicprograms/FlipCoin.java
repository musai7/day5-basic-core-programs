package com.day5.basicprograms;

import java.util.Scanner;

public class FlipCoin {
	public final static int IS_HEAD = 1;
	public final static int IS_TAIL = 0;

	public double percentageMethod(double check, double num) {
		double percentage = (check / num) * 100;
		return percentage;

	}

	public static void main(String[] args) {
		double no_of_heads = 0, no_of_tails = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number for getting number of times to Flip Coin");
		int num = sc.nextInt();
		if (num > 0) {
			for (int counter = 1; counter <= num; counter++) {
				double flip_Check = Math.random();

				if (flip_Check > .5f) {
					no_of_heads += 1;
				} else {
					no_of_tails += 1;
				}
			}
		}
		FlipCoin fp = new FlipCoin();
		double perOfHeads = fp.percentageMethod(no_of_heads, num);
		double perOfTails = fp.percentageMethod(no_of_tails, num);
		if (perOfHeads > perOfTails) {
			System.out.println("percentage of heads : " + perOfHeads + " is greater than : " + " percentage of tails"
					+ perOfTails);
		} else if (perOfHeads < perOfTails) {
			System.out.println(
					"percentage of tails: " + perOfTails + " is greater than : " + " percentage of heads" + perOfHeads);
		} else
			System.out.println("both heads and tails percentage is equal ");

	}
}