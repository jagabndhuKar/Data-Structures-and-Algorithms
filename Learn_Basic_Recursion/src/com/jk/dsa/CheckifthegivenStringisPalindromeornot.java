package com.jk.dsa;

public class CheckifthegivenStringisPalindromeornot {

	public static void main(String[] args) {
		System.out.println(checkifthegivenStringisPalindromeornot("aba"));
		System.err.println(checkifthegivenStringisPalindromeornot2("abba", 0, 3));
	}

	public static boolean checkifthegivenStringisPalindromeornot(String s) {
		int i = 0, j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean checkifthegivenStringisPalindromeornot2(String s,int left,int right) {
	
		if(left>right) {
			return true;
		}else {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left=left+1;
			right=right-1;
			System.err.println(left+" "+right);
			return checkifthegivenStringisPalindromeornot2(s,left,right);
		}
	
	} 
}
