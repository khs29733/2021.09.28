package com.company.project004;

import java.util.Scanner;

public class A016 {
	public static void main(String[] args) {
		//gigo
		//����
		Scanner sc = new Scanner(System.in);
		double kor = 0.0, math = 0.0, eng = 0.0;
		
		//�Է�
		System.out.println("�������� �Է� : ");
		kor = sc.nextDouble();
		System.out.println("�������� �Է� : ");
		math = sc.nextDouble();
		System.out.println("�������� �Է� : ");
		eng = sc.nextDouble();
		
		//ó��
		double sum = kor + math + eng;
		double avg = sum / 3;
		
		//���		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
		
		
	}
}
