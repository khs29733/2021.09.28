package com.company.day002;

public class A001 {
	public static void main(String[] args) {
		System.out.println("����");
		System.out.println("���ϴ� �����͸� �����ϴ� ����");
		
		//��������
		//�ڷ���	������
		//����	: 1,10,20,...
		int purse;
		//System.out.println("������ ����ִ� �� (0)" + purse);
		purse = 100000; //�ʱⰪ�� �ִ°��� ���ͷ�
		System.out.println("������ ����ִ� �� (1) : " + purse);
		purse = 30000;	//A = B ����(�ְڴ�)
		System.out.println("������ ����ִ� �� (2) : " + purse);
		purse = 30000 - 12000;	//A = B(30000 - 12000 �Ѵ����� purse�� �ֱ�)
		System.out.println("������ ����ִ� �� (3) : " + purse);
		
		////
		int a; a = 10; System.out.println(a);
		int b = 20; System.out.println(b);
		double c = 3.14; System.out.println(c);
	}//end main
}//end class
