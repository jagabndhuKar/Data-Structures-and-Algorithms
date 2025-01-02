package com.jk.dsa;

import java.util.ArrayList;
import java.util.List;

public class PrintallDivisorsofagivenNumber {

	public static void main(String[] args) {
		List<Integer> result = printallDivisorsofagivenNumber2(36);
		result.stream().forEach(System.out::println);
	}

	public static List<Integer> printallDivisorsofagivenNumber(int number) {
		List<Integer> result = new ArrayList();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				result.add(i);
		}
		return result;
	}
//optemised approch 
	public static List<Integer> printallDivisorsofagivenNumber2(int number) {
		List<Integer> result = new ArrayList();
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				result.add(i);
				if (i != number / i) {
					result.add(number / i);
				}
			}
		}
		return result;
	}
}
