package com.company.project004;

import java.util.Scanner;

public class A013 {
	public static void main(String[] args) {
		float f = 0.0F;//초기값
		double d = 0.0;//초기값
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("실수를 입력해주세요 1 > ");
		f = scanner.nextFloat();
		
		System.out.println("실수를 입력해주세요 2 > ");
		d = scanner.nextDouble();
		
		System.out.println(f + " / " + d);
	}
}
