package com.dhanush.corejava;

import java.util.Scanner;

public class _1NumberPattren2 {

	public static void main(String[] args) {
		System.out.println("Enter the n value");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
			{   if(i*j<10) {
				System.out.print("0"+i*j+" ");
				}
				else {
				System.out.print(i*j+" ");
				}
			}
			System.out.println();
		}
	}
}
