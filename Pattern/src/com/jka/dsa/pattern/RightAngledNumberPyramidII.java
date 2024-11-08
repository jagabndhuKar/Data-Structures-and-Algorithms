/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
package com.jka.dsa.pattern;

import java.util.Scanner;

public class RightAngledNumberPyramidII {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

}
