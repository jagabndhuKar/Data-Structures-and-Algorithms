package com.jka.dsa.pattern;

import java.util.Scanner;

/*
 
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *

*/

public class RectangularStarPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		scanner.close();
	}
}
