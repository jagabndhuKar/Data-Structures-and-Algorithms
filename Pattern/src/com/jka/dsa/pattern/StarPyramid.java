
/* 
  
     *     
    ***    
   *****   
  *******  
 ********* 
***********

*/
package com.jka.dsa.pattern;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				if(j<=number-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
