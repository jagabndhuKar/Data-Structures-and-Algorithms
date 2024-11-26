/*

1
01
101
0101
10101
010101

 * */


package com.jka.dsa.pattern;

import java.util.Scanner;

public class BinaryNumberTrianglePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j || (i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
