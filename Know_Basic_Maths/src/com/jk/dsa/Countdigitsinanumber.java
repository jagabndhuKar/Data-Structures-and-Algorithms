package com.jk.dsa;

public class Countdigitsinanumber {

	public static void main(String[] args) {

System.out.println(countDigitsInNumberOne(123456789));
System.out.println(countDigitsInNumberTwo(1023456789));
System.out.println(countDigitsInNumberThree(1023456789));


	}
	//Option one Brute force
	public static String countDigitsInNumberOne(Integer n) {
		Integer number = n;
		Integer counter = 0;
		while (n>0) {
			n=n/10;
			counter++;
		}
			
		return "The digits in given nuber "+number+" is "+counter;
	}

	
	//Option two force
	public static String countDigitsInNumberTwo(Integer n) {
		long number = n;
		return "The digits in given nuber "+number+" is "+String.valueOf(n).length();
	}
	
	//Option Three force
	public static String countDigitsInNumberThree(Integer n) {
		Integer number = n;
		Integer counter = (int) (Math.log10(n) + 1);
		return "The digits in given nuber "+number+" is "+counter;
	}

}
