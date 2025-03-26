package com.dhanush.task;

import java.util.Scanner;

public class _4PyramidPascalTraingle {
	public static void main(String[] args) {
		System.out.println("Enter the n value");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++) {
			int count=1;
			for(int k=0;k<=n-i-1;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(count+" ");
				count=count*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
