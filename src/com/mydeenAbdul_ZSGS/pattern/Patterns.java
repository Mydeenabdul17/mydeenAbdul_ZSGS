package com.mydeenAbdul_ZSGS.pattern;

public class Patterns {
	public static void pattern1(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0;j<n; j++) {
				if(i==j||i==0||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern2(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0;j<n; j++) {
				if(i+j==n-1||i==0||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern3(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n*2)-1; j++) {
				if(i==j||i+j==((n*2)-2)||i==0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern4(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n*2)-1; j++) {
				if(i+j==n-1||j-i==n-1||i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern5(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0;j<n+n-1; j++) {
				if((i==0&&j<=n-1)||(i==n-1&&j>=n-1)||(i==j||i==j-n+1))
					System.out.print("*");
				else
					System.out.print(" ");
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern6(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0;j<n+n-1; j++) {
				if((i==0&&j>=n-1)||(i==n-1&&j<=n-1)||(i+j==n-1||i+j==n+(n-2)))
					System.out.print("*");
				else
					System.out.print(" ");
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern7(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0;j<n; j++) {
				if((i==j||i+j==n-1||j==0)&&(i>=j&&i+j<=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern8(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0;j<n; j++) {
				if((i==j||i+j==n-1||j==n-1)&&(i<=j&&i+j>=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern9(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j+i==n/2||j-i==n/2) {
					System.out.print("*");
				}else if(i>n/2&&(j+i==(n/2)+(n-1)||i-j==n/2)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern10(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j+i<=n/2||j-i>=n/2) {
					System.out.print("*");
				}else if(i>n/2&&(j+i>=(n/2)+(n-1)||i-j>=n/2)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern11(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern12(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==0||j==0||i==n-1||j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern13(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==j||i+j==n-1||i==0||i==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	public static void pattern14(int n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(!(i>j&&i+j>n-1)&&!(i<j&&i+j<n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
	
}
