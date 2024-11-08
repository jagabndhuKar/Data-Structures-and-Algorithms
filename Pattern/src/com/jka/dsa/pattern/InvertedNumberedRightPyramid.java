/*
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
*/
package com.jka.dsa.pattern;

import java.util.Scanner;

public class InvertedNumberedRightPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		for (int i = number; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}
