/*
 
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
* 

*/
package com.jka.dsa.pattern;

import java.util.Scanner;

public class InvertedRightPyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		for (int i = number; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
