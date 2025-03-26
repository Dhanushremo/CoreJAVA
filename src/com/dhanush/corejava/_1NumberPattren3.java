package com.dhanush.corejava;

import java.util.Scanner;

public class _1NumberPattren3 {

public static void main(String[] args) {
	System.out.println("Enter the n value");
	int n=new Scanner(System.in).nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(i+j-1+" ");
		}
		System.out.println();
	}
}
}
