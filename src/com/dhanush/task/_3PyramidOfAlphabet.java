package com.dhanush.task;

import java.util.Scanner;

public class _3PyramidOfAlphabet {
	public static void main(String[] args) {
		System.out.println("Enter the n value");
		int n=new Scanner(System.in).nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=(2*i)-1;j++) {
				if(j<i) {
					System.out.print(ch++ +" ");
				}else {
					System.out.print(ch-- + " ");
				}
			}
			System.out.println();
		}
	}
}
