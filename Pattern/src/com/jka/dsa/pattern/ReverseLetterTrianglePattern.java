/*
A B C D E 
A B C D 
A B C 
A B 
A  
*/


package com.jka.dsa.pattern;

import java.util.Scanner;

public class ReverseLetterTrianglePattern {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	int number = scanner.nextInt();
	
	for(int i=number;i>=1;i--) {
		char character= 'A';
		for(int j=i;j>0;j--) {
			System.out.print((character++)+" ");
		}
		System.out.println();
	}

}
}
