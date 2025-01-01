package com.jk.dsa;

public class ReverseDigitsofANumber {

	public static void main(String[] args) {
		System.out.println(reverseDigitsofANumber(10002));

	}

//aproch one	
	public static int reverseDigitsofANumber(int number) {
		int answer = 0;
		while (number > 0) {
			int degit = number % 10;
			number = number / 10;
			answer = (answer * 10) + degit;
		}
		return answer;
	}

	
	
}
