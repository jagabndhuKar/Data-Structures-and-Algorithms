package com.jk.dsa;

public class FindGCDoftwonumbers {

	public static void main(String[] args) {

		System.err.println(findGCDoftwonumbers2(11, 121));
	}
	
	public static int findGCDoftwonumbers(int n1,int n2){
		int smallest = n1>n2?n2:n1,gcd =Integer.MIN_VALUE;
		while(smallest>0) {
			if(n1%smallest==0 && n2%smallest==0) {
				if(smallest>gcd) {
					gcd=smallest;
					return gcd;
				}
			}
			smallest--;
		}
		return gcd;
	}
	
//	The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers. 
	
	public static int findGCDoftwonumbers2(int n1,int n2) {
		while(n1>0 && n2>0) {
			if(n1>n2) {
				n1-=n2;
			}else {
				n2-=n1;
			}
		}
		return n1==0?n2:n1;
	}

}
