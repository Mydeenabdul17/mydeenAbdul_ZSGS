package com.mydeenAbdul_ZSGS.binaryDecimal;

import java.lang.reflect.Method;
import java.util.Scanner;

public class BinaryDecimalConvertion {
	static Scanner sc=new Scanner(System.in);
	public static int binaryToDecimal() {
		System.out.println("Enter the Binary value");
		int num=sc.nextInt();
		int res=0,i=0;
		while (num>0) {
			res+=((num%10)*Math.pow(2, i++));
			num/=10;
		}
		return res;
	}
	public static int decimalToBinary() {
		System.out.println("Enter the Decimal value");
		int num=sc.nextInt();
		String res="";
		while (num>0) {
			res=(num%2)+res;
			num/=2;
		}
		return Integer.parseInt(res);
	}
}
