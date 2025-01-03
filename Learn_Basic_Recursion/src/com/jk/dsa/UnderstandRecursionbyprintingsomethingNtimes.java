package com.jk.dsa;

public class UnderstandRecursionbyprintingsomethingNtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printUpTON(10);
	}

	public static void printUpTON(int number) {
		
		if (number <= 0)
			return;
		number = number - 1;
		printUpTON(number);
		System.out.println(number);
	}
	  
}
