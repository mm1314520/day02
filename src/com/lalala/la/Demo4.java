package com.lalala.la;

import java.util.Scanner;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		scanner.close();
		String monthString = "";
		// ����һ�������գ�1-7
		switch (day) {
		case 1:
			monthString = "����һ";
			break;
		case 2:
			monthString = "���ڶ�";
			break;
		case 3:
			monthString = "������";
			break;
		case 4:
			monthString = "������";
			break;
		case 5:
			monthString = "������";
			break;
		case 6:
			monthString = "������";
			break;
		case 7:
			monthString = "������";
			break;
		default:
			monthString = "����day";
			break;
		}
		System.out.println(monthString);

	}

}
