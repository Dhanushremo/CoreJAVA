package com.dhanush.datatypes;

public class _3TypeConversions {
	public static void main(String[] args) {
		//Implicit TypeCasting
		System.out.println("Implicit TypeCasting");
		byte a=100;
		short b=a;
		int c=b;
		long d=c;
		float e=d;
		double f=e;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		//Excplicit Type Casting
		System.out.println("Excplicit Type Casting");
		int m=10;
		byte n=(byte)m;
		short k=(short)m;
		double v=500f;
		double z=v;
		System.out.println(m);
		System.out.println(n);
		System.out.println(k);
		System.out.println(v);
		System.out.println(z);
		
	}
}
