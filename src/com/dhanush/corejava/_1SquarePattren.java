package com.dhanush.corejava;

import java.util.Scanner;

public class _1SquarePattren {
	public static void main(String[] args) {
		System.out.println("Enter the n value");
		int n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				//System.out.print("*");
				//System.out.print(i);
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
