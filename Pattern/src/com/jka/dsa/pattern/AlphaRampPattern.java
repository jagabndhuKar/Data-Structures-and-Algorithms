/*
A 
B B 
C C C 
D D D D 
E E E E E 
 */


package com.jka.dsa.pattern;

import java.util.Scanner;

public class AlphaRampPattern {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		char character= 'A';

		for(int i=1;i<=number;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(character+" ");
			}
			character++;
			System.out.println();
		}



	}

}
