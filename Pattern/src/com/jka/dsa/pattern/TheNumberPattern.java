package com.jka.dsa.pattern;

public class TheNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		theNumberPattern(4);

	}
	public static void theNumberPattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				if(j>=i) {
					System.out.print(j);
				}else {
					System.out.print(i);
					
				}
			}
			for(int j=2;j<=n;j++) {
				if(j>=i) {
					System.out.print(j);
				}else {
					System.out.print(i);
					
				}
			}
			System.out.println();
		}
		

		for(int i=2;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(j>=i) {
					System.out.print(j);
				}else {
					System.out.print(i);
					
				}
			}
			for(int j=2;j<=n;j++) {
				if(j>=i) {
					System.out.print(j);
				}else {
					System.out.print(i);
					
				}
			}
			System.out.println();
		}
	
	}

}
