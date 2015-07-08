package com.lalala.la;

import java.util.Scanner;

public class Sanjiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("«Î ‰»Î––∫≈");
//int num=input.nextInt();//int i,j,k;
Scanner scanner = new Scanner(System.in);
int num = scanner.nextInt();
scanner.close();
for (int i = 1; i <= num; i++) {
	for (int j = 1; j <= num - i; j++)
		System.out.print(" ");
	for (int j = 1; j <= 2 * i - 1; j++)
		if (i <= 9)
			System.out.print(i);
		else {
			System.out.print((char) ('A' + i-10));
		}
	System.out.println();
}
}
}

