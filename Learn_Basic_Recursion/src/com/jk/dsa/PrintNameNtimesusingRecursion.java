package com.jk.dsa;

public class PrintNameNtimesusingRecursion {

	public static void main(String[] args) {
		printNameNtimesusingRecursion(10);

	}
public static void printNameNtimesusingRecursion(int number) {
	if (number <= 0)
		return;
	System.out.println("jagabandhu kar");
	number = number - 1;
	printNameNtimesusingRecursion(number);
}
}
