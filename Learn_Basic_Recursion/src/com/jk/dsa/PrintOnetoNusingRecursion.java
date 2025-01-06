package com.jk.dsa;

public class PrintOnetoNusingRecursion {

	public static void main(String[] args) {
		printOnetoNusingRecursion(1, 10);
	}

	public static void printOnetoNusingRecursion(int i, int n) {
		if (i > n)
			return;
		System.out.println(i);
		printOnetoNusingRecursion((i + 1), n);
	}
}
