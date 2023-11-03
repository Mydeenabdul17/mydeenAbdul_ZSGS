package com.mydeenAbdul_ZSGS.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	static Scanner sc=new Scanner(System.in);
	public static void myMain(String[] args) {
		System.out.println("Enter the first matrix row");
		int row1=sc.nextInt();
		System.out.println("Enter the first matrix column");
		int col1=sc.nextInt();
		int [][]m1=new int[row1][col1];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.println("enter the value");
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix row");
		int row2=sc.nextInt();
		System.out.println("Enter the second matrix column");
		int col2=sc.nextInt();
		int [][]m2=new int[row2][col2];
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.println("enter the value");
				m2[i][j]=sc.nextInt();
			}
		}
		if(col1!=row2) {
			System.out.println("not possible");
		}else {
			int res[][]=new int[row1][col2];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[i].length; j++) {
					for (int j2 = 0; j2 < res.length; j2++) {
						res[i][j]+=m1[i][j2]*m2[j2][j];
					}
				}
			}
			//System.out.println(Arrays.toString(res));
			for (int i = 0; i < res.length; i++) {
				System.out.println(Arrays.toString(res[i]));
			}
		}
	}
	
}
