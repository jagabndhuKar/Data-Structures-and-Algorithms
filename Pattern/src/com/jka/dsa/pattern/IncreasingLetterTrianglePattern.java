/*
A 
A B 
A B C 
A B C D 
A B C D E 
 */


package com.jka.dsa.pattern;

import java.util.Scanner;

public class IncreasingLetterTrianglePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			char character= 'A';
			for(int j=1;j<=i;j++) {
				System.out.print((character++)+" ");
			}
			System.out.println();
		}
	}

}
