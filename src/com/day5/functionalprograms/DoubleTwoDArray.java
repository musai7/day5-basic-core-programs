package com.day5.functionalprograms;

import java.util.Scanner;

public class DoubleTwoDArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of rows ");
		int m=sc.nextInt();
		System.out.println("enter number of coloums");
		int n =sc.nextInt();
		 double [][]doublearr=new double[m][n];
		 for(int i=0;i<doublearr.length;i++) {
			 for(int j=0;j<doublearr.length;j++) {
				 System.out.print("enter a number in ["+i+"]["+j+"] : ");
				 doublearr[i][j]=sc.nextDouble();
			 }
		 }
		 for(int i=0;i<doublearr.length;i++) {
			 for(int j=0;j<doublearr.length;j++) {
				 System.out.print(doublearr[i][j]+" ");
			 }
			 System.out.println();
		 }
		
	}
}
