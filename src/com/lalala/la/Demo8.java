package com.lalala.la;

public class Demo8 {
	static void sort(int a[]) {
		int temp;
		for (int i = 0; i < a.length - 1; i++)
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
	}
	static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 8, 5, 7, 4, 20 };
		sort(a);
		printArray(a);
	}

}
