package com.company.project004;

public class A004 {
	public static void main(String[] args) {
		int year = 0;
		int age  = 19;
		System.out.println(year); 	//��� : 0
		System.out.println(age);	//��� : 19
		year = age + 2000;			//���� age���� 2000�� ���ؼ� ���� year�� ����
		age = age + 1;				//���� age�� ����� ���� 1���� ��Ų��
		System.out.println(year);	//��� : 2019
		System.out.println(age);	//��� : 20
	}
}
