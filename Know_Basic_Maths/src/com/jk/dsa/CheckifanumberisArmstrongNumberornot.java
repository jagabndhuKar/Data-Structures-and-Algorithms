package com.jk.dsa;

public class CheckifanumberisArmstrongNumberornot {

	public static void main(String[] args) {

		System.err.println(checkifanumberisArmstrongNumberornot(153));
	}

	public static boolean checkifanumberisArmstrongNumberornot(int number) {

		int numberOfDesit=0, result=0;
		int tempstorForDegit = number, tempStorForcal=number;
		while(tempstorForDegit>0) {
			tempstorForDegit/=10;
			numberOfDesit++;
		}
		
		while(tempStorForcal>0) {
			int degit=tempStorForcal%10;
			tempStorForcal=tempStorForcal/10;
			int powerOfNumber=1;
			for(int i=1;i<=numberOfDesit;i++) {
				powerOfNumber*=degit;
			}
			result+=powerOfNumber;
		}
		
		return number == result;
	}
}
