package com.lalala.la;

import java.util.Scanner;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO �Զ����ɵķ������
				// ����ѧ���ķ������ѧ���ĳɼ��ȼ�
				Scanner scanner = new Scanner(System.in);
				int score = scanner.nextInt();
				scanner.close();
				if (score > 100 || score < 0) {
					System.out.println("�������");
				} else if (score >= 90) {
					System.out.println("�ȼ�ΪA");
				} else if (score >= 80) {
					System.out.println("�ȼ�ΪB");
				} else if (score >= 70) {
					System.out.println("�ȼ�ΪC");
				} else if (score >= 60) {
					System.out.println("�ȼ�ΪD");
				} else {
					System.out.println("�ȼ�ΪE");
				}
	}

}
