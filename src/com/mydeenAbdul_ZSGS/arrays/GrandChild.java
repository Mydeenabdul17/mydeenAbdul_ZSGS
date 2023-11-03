package com.mydeenAbdul_ZSGS.arrays;

import java.util.Scanner;

public class GrandChild {

	static Scanner sc=new Scanner(System.in);
	public static void myMain() {
		System.out.println("enter the num of pairs");
		int n=sc.nextInt();
		sc.nextLine();
		String [][]s=new String[n][2];
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter the child name");
			s[i][0]=sc.next();
			System.out.println("Enter the father name");
			s[i][1]=sc.next();
		}
		System.out.println("Enter the grand father name");
		String gn=sc.next();
		int count=findGrandchild(s, gn);
		System.out.println(count);
	}
	public static int findGrandchild(String[][]s,String gn) {
		int count =0;
		for(int i=0;i<s.length;i++) {
			if(s[i][1].equals(gn)) {
				String f=s[i][0];
				for(int j=0;j<s.length;j++) {
					if(s[j][1].equals(f)) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
