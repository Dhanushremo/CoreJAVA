package com.dhanush.task;

import java.util.Scanner;

public class _4PyramidOfPowerOf2 {
	public static void main(String[] args) {
		System.out.println("Enter the n value");
		int n=new Scanner(System.in).nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count*=2;
			}
			System.out.println();
		}
	}
}
