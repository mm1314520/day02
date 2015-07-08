package com.lalala.la;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100;) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		
		int[] a = { 1, 2, 3, 4 };
		for (int i : a) 
		{
			System.out.println(i);
		}
	}

}
