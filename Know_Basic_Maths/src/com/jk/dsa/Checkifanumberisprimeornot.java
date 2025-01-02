package com.jk.dsa;

public class Checkifanumberisprimeornot {

	public static void main(String[] args) {

	}

	public static Boolean checkifanumberisprimeornot(int number) {
		int counter = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				counter++;
		}
		return counter > 2 ? Boolean.FALSE : Boolean.TRUE;
	}
	
	public static Boolean checkifanumberisprimeornot2(int number) {
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0)
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
}
