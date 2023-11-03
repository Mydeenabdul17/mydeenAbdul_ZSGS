package com.mydeenAbdul_ZSGS.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WeightOfNum {

	static Scanner sc=new Scanner(System.in);
	public static void myMain(String[] args) {
		System.out.println("Enter the count of numbers");
		int n=sc.nextInt();
		int num[]=new int[n];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter the value");
			num[i]=sc.nextInt();
		}
		int res[][]=findWeight(num);
		for (int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
	}
	public static int[][] findWeight(int[]a){
		int[][]res=new int[a.length][2];
		for (int i = 0; i < a.length; i++) {
			int weight=0;
			if(a[i]>0) {
				if(a[i]%2==0)
					weight+=3;
				if(a[i]%4==0&&a[i]%6==0)
					weight+=4;
				if(isPerfectSquare(a[i]))
					weight+=5;
			}
			res[i][0]=a[i];
			res[i][1]=weight;
		}
		return sort(res);
	}
	public static int[][] sort(int[][]a){
		boolean b;
		do {
			b=false;
			for (int i = 0; i < a.length-1; i++) {
				if(a[i][1]<a[i+1][1]) {
					int temp[]=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					b=true;
				}
			}
		} while (b);
		return a;
	}
	public static boolean isPerfectSquare(int a) {
		int sqroot=(int) Math.sqrt(a);
		return sqroot*sqroot==a;
	}
}
