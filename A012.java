package com.company.project004;

import java.util.Scanner;

public class A012 {
	public static void main(String[] args) {
		//GIGO
		//����
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0; int result = 0;
		//�Է�
		System.out.println("���ϱ� ���α׷��Դϴ�");
		System.out.println("����1 �Է� : ");
		a = scanner.nextInt();
		System.out.println("����2 �Է� : ");
		b = scanner.nextInt();
		//ó��
		result = a+b; //A = B B�� �۾��ؼ� A�� �ְڴ�/B(a+b)�� �ؼ� result�� �ֱ�
		//���
		System.out.println("��� : " + a + "+" + b + "=" + (a+b));
		

	}
}
