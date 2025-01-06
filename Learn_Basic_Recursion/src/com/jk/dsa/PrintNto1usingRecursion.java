package com.jk.dsa;

public class PrintNto1usingRecursion {

	public static void main(String[] args) {
printNto1usingRecursion(10);
	}
public static void printNto1usingRecursion(int n) {
	if(n<=0)return;
	System.out.println(n);
	printNto1usingRecursion((n-1));
}
}
