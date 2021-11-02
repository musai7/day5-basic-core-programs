package com.day5.functionalprograms;

import java.util.Scanner;

public class TriplesSumZero {
	public static void main(String[] args) {
		int temp=0;
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array ");
		int m=sc.nextInt();
		int []arr=new int[m];
		for(int i=0;i<m;i++) {
				System.out.print("enter a number in arr[" + i + "] : ");
				arr[i] = sc.nextInt();
		}
		for (int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=i+2;k<arr.length;k++) {
					if (arr[i]+arr[j]+arr[k]==0) {
						temp++;
						System.out.println("triplets are : "+arr[i]+" "+arr[j]+" "+arr[k]);
					}
					
				}
				
			}
		}
		System.out.println(temp);
	}

}
