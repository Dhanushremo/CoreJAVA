package com.dhanush.corejava;

import java.util.Scanner;

public class _1NumberPattren {
	public static void main(String[] args) {
		System.out.println("Enter the n value");
		int n=new Scanner(System.in).nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(count<10) {
				System.out.print("0"+ count++ +" ");
				}else {
				System.out.print(count++ +" ");
				}
			}
			System.out.println();
		}
	}
}
