package com.lalala.la;
   
public class Demo5 {
	public enum day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		day c = day.Monday;
		int i = 0;
		switch (c) {
		case Monday:
			i = 1;
			break;
		case Tuesday:
			i = 2;
			break;
		case Wednesday:
			i = 3;
			break;
		case Thursday:
			i = 4;
			break;
		case Friday:
			i = 5;
			break;
		case Saturday:
			i = 6;
			break;
		case Sunday:
			i = 7;
			break;
		default:
			break;
		}
		System.out.println(i);


	}

}
