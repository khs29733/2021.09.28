package com.company.project004;

import java.util.Scanner;	//2. Scanner Ŭ���� ����ϱ� ���� �߰�

// ��ǥ : �Է¹޴� ��ǰ(Ŭ����) ����ϱ�
// �ڹ������� ��������
// ������ ����

public class A009 {
	public static void main(String[] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);	//1.ctrl + shift + o
		//��ǰ(��ü)�� �����ٻ���Ҷ��� �ܼ��� ���� �ƴ϶� ��� �� �������� ������ �־ ������ �ʿ����
		//��ü����ϱ� 1) new�� ����������	2) ��ü���� ����,���()
		a = 10;//�� //a�� 10����
		System.out.println("�����ϴ� ���ڸ� �Է����ּ��� > ");
		a = scanner.nextInt();//a��� ������ scanner����� �̿��� �Է¹��� ���� ����
		System.out.println("�����ϴ� ���ڴ� : " + a + "�Դϴ�.");
	}
}
