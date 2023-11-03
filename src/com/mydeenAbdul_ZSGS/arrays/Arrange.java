package com.mydeenAbdul_ZSGS.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrange {

	static Scanner sc=new Scanner(System.in);
	public static void myMain() {
		System.out.println("Enter the count of num");
		int n=sc.nextInt();
		int []num=new int[n];
		for (int i = 0; i < n; i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		int res[]=new int[n];
		int i=num.length%2==0?res.length-2:res.length-1;
		int j=0;
		while(i<res.length) {
			if(i==0) {
				res[i]=num[j++];
				i++;
			}else if(i%2==0) {
				res[i]=num[j++];
				i-=2;
			}else {
				res[i]=num[j++];
				i+=2;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
