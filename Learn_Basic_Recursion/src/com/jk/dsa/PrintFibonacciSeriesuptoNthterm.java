package com.jk.dsa;

public class PrintFibonacciSeriesuptoNthterm {

	public static void main(String[] args) {
		printFibonacciSeriesuptoNthterm2(0,1,0,10);
	}

	public static void printFibonacciSeriesuptoNthterm(int n) {
		int a = 0, b = 1, c = 0;
		while (a < n) {
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	public static void printFibonacciSeriesuptoNthterm2(int a,int b,int c,int n) {
		if(a>n)return;
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		printFibonacciSeriesuptoNthterm2(a, b, c, n);
	}
}
