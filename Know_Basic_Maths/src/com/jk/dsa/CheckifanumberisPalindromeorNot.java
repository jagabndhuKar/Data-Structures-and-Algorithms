package com.jk.dsa;

public class CheckifanumberisPalindromeorNot {

	public static void main(String[] args) {

		System.out.println(checkifanumberisPalindromeorNot(1212));
	}
	
	public static boolean checkifanumberisPalindromeorNot(int number) {
		int temp=number,comp = number, revNumber=0;
		
		while(temp>0)
		{
			int digits=temp%10;
			temp/=10;
			revNumber=(revNumber*10)+digits;
		}
		if(revNumber==number)return true;
		return false;
	}

}
