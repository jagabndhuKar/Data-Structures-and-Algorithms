package com.jka.dsa.pattern;

import java.util.Scanner;

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
*/
public class RightAngledNumberPyramid {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number"+"\n");
	int number = scanner.nextInt();
	for(int i=1;i<=number;i++) {
		for(int j=1;j<=i;j++) {
			String print = " %d";
			System.out.print(String.format(print, j));
		}
		System.out.println();
		scanner.close();
	}
	}

}
