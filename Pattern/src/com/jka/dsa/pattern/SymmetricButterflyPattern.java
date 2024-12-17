package com.jka.dsa.pattern;

public class SymmetricButterflyPattern {

	public static void main(String[] args) {
		symmetricButterflyPattern(5);

	}
	
public static void	symmetricButterflyPattern(int n) {

	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j<=i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		for(int j=n;j>0;j--) {
			if(j<=i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	

	for(int i=1;i<=n;i++) {
		for(int j=n;j>0;j--) {
			if(j>i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		for(int j=1;j<=n;j++) {
			if(j>i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}


}

}
