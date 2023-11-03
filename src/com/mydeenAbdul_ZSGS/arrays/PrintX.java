package com.mydeenAbdul_ZSGS.arrays;

import java.util.Scanner;

public class PrintX {
	static Scanner sc =new Scanner(System.in);
	public static void myMain() {
		System.out.println("Enter the String");
		String s=sc.next();
		if(s.length()%2==1) {
			for(int i=0,k=s.length()-1;i<s.length();i++){
				for(int j=0;j<s.length();j++) {
					if(i==j) {
						System.out.print(s.charAt(i));
						if(i+j==s.length()-1) {
							k--;
						}
					}else if(i+j==s.length()-1) {
						System.out.print(s.charAt(k--));
					}else {
						System.out.print(" ");
					}
					
				}
				System.out.println("");
			}
		}else {
			System.out.println("enter correct string ");
		}
	}

}
