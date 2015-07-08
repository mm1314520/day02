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
		// 星期一到星期日：1-7
		switch (day) {
		case 1:
			monthString = "星期一";
			break;
		case 2:
			monthString = "星期二";
			break;
		case 3:
			monthString = "星期三";
			break;
		case 4:
			monthString = "星期四";
			break;
		case 5:
			monthString = "星期五";
			break;
		case 6:
			monthString = "星期六";
			break;
		case 7:
			monthString = "星期天";
			break;
		default:
			monthString = "错误day";
			break;
		}
		System.out.println(monthString);

	}

}
