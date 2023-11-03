package com.mydeenAbdul_ZSGS.pattern;

public class Pyramids {
	public static void pyramid1(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n*2)-1; j++) {
				if(i+j>=n-1&&j-i<=n-1) {
					if(i+j==n-1&&j-i==n-1) {
						System.out.print(i+1);
					}
					else if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)) {
						System.out.print(i+1);
					}else {
						System.out.print(" ");
					}
				}else{
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pyramid2(int n) throws InterruptedException {
		int k=n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n*2)-1; j++) {
				if(i<=j&&i+j<=((n*2)-2)) {
					if(i==j&&i+j==((n*2)-2)) {
						System.out.print(k);
					}
					else if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)) {
						System.out.print(k);
					}else {
						System.out.print(" ");
					}
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
			k--;
		}
	}
	public static void pyramid3(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n*2)-1; j++) {
				if(i<=j&&i+j<=((n*2)-2)) {
					if(i==j&&i+j==((n*2)-2)) {
						System.out.print("*");
					}
					else if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pyramid4(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			int k=0;
			for (int j = 0; j < (n*2)-1; j++) {
				if(i+j>=n-1&&j-i<=n-1) {
					if(j<n)
					System.out.print(j+1);
					else {
						System.out.print(j-1-k);
						k+=2;
					}
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pyramid5(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			int k=0;
			for (int j = 0; j < (n*2)-1; j++) {
				if(i+j>=n-1&&j-i<=n-1) {
					if(j<n)
					System.out.print(++k);
					else
						System.out.print(--k);
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pyramid6(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n*2)-1; j++) {
				if(i+j>=n-1&&j-i<=n-1) {
					if(i+j==n-1&&j-i==n-1) {
						System.out.print("*");
					}
					else if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}else{
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pyramid7(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			int k=0;
			for (int j = 0; j < (n*2)-1; j++) {
				if(i+j>=n-1&&j-i<=n-1) {
					if(i+j==n-1&&j-i==n-1) {
						System.out.print(++k);
					}
					else if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)) {
						System.out.print(++k);
					}else {
						System.out.print(" ");
					}
					
				}else{
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
}
