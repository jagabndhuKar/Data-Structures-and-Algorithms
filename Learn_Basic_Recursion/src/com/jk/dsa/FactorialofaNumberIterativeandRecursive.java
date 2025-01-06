package com.jk.dsa;

public class FactorialofaNumberIterativeandRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialofaNumberIterative(5));
		System.err.println(factorialofaNumberRecursive(5, 1));

	}

	public static long factorialofaNumberIterative(int number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static long factorialofaNumberRecursive(int number, long fact) {
		if (number <= 0)
			return fact;
		fact *= number;
		return factorialofaNumberRecursive((number - 1), fact);
	}

}
