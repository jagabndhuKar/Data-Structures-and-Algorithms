/*
 
  A  
 ABA 
ABCBA
 
 */


package com.jka.dsa.pattern;

public class AlphaHillPattern {

	public static void main(String[] args) {
		alphaHillPattern(3);

	}
	public static void alphaHillPattern(int n) {
		for(int i=1;i<=n;i++) {
			char c ='A';
			for(int j=n;j>=1;j--) {
				if(j<=i) {
					System.out.print(c++);
				}else {
					System.out.print(" ");
				}
			}
			for(int k=i-1;k>0;k--) {
				
				System.out.print((char)('A'+k-1));
			}
			System.out.println();
		}
	}

}
