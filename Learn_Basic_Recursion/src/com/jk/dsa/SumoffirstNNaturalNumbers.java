package com.jk.dsa;

public class SumoffirstNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the sum is "+sumoffirstNNaturalNumbers(5, 0));

	}
public static int sumoffirstNNaturalNumbers(int n,int sum) {
	if(n<=0) {return sum;}
	sum+=n;
	return sumoffirstNNaturalNumbers((n-1), sum);
}
}
