package com.jka.dsa.pattern;

public class HollowRectanglePattern {

	public static void main(String[] args) {
hollowRectanglePattern(5);
	}

	public static void hollowRectanglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || i==1 || j==n || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
