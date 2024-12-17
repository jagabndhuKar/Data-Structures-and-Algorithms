/*
F
E F
D E F
C D E F
B C D E F
A B C D E F
 * */



package com.jka.dsa.pattern;

public class AlphaTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphaTrianglePattern(5);

	}
	
	public static void alphaTrianglePattern(int n) {
		for(int i=n;i>0;i--) {
			char c=(char) ('A'+(i-1));
			for(int j=i;j<=n;j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
	}

}
