package com.company.project004;

import java.util.Scanner;

public class A018 {
	public static void main(String[] args) {
		//GIGO �Է� ���� ���������� 2��, ����� ���� �Ǽ��� ������ ����ÿ�
		int enum1=0, enum2=0; float result = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����1 �Է� : ");
		enum1 = sc.nextInt();
		System.out.println("����2 �Է� : ");
		enum2 = sc.nextInt();
		
		result = (enum1 + enum2) / 2;
		System.out.println("������ ��� :" + result );
	}
}
