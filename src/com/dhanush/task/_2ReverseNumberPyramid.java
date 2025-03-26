package com.dhanush.task;

import java.util.Scanner;

public class _2ReverseNumberPyramid {

public static void main(String[] args) {
	System.out.println("Enter the n value");
	int n=new Scanner(System.in).nextInt();
	int count;
	for(int i=1;i<=n;i++) {
		 count=n-i+1;
		for(int j=1;j<=(n-i)+1;j++) {
			System.out.print(count--);
		}
		System.out.println();
	}
	}
}