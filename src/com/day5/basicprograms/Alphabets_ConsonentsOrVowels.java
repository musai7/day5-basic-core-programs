package com.day5.basicprograms;

import java.util.Scanner;

public class Alphabets_ConsonentsOrVowels {
	public static void main(String[] args) {
		System.out.println("enter a latter to check consont or vowel ");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		switch (num) {
		case "a":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "e":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "i":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "o":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "u":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "A":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "E":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "I":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "O":
			System.out.println("entered charecter is VOWEL ");
			break;
		case "U":
			System.out.println("entered charecter is VOWEL ");
			break;
		default :
			System.out.println("entered charecter is CONSONENT ");
			break;

		}
	}

}
