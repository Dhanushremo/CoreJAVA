package com.dhanush.task;

import java.util.Scanner;

public class _1HallowDaimondPattren {

public static void main(String[] args) {
	System.out.println("Enter the n value");
	int n=new Scanner(System.in).nextInt();
	for(int i=1;i<=n;i++) {
		//For Spaces
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i==j||j==1) {
			System.out.print("*"+" ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	for(int l=n;l>=1;l--) {
		for(int k=1;k<=n-l;k++) {
			System.out.print(" ");
		}
		for(int m=1;m<=l;m++) {
			if(l==m||m==1) {
				System.out.print("*"+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
