package com.dhanush.corejava;

import java.util.Scanner;

public class _1HallowTaringle {

public static void main(String[] args) {
	System.out.println("Enter the n value");
	int n=new Scanner(System.in).nextInt();
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(j==1||i==n||i==j) {
			System.out.print("*"+" ");
			}
			else {
				System.out.print(" "+" ");
			}
		}
		System.out.println();
	}
}
}
