package com.company.project004;

import java.util.Scanner;

public class A013 {
	public static void main(String[] args) {
		float f = 0.0F;//�ʱⰪ
		double d = 0.0;//�ʱⰪ
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Ǽ��� �Է����ּ��� 1 > ");
		f = scanner.nextFloat();
		
		System.out.println("�Ǽ��� �Է����ּ��� 2 > ");
		d = scanner.nextDouble();
		
		System.out.println(f + " / " + d);
	}
}
