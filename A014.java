package com.company.project004;

import java.util.Scanner;

public class A014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pie = 0;
		
		System.out.println("pie의 값은 얼마입니까? : ");
		pie = sc.nextDouble();
		System.out.println("pie의 값은 " + pie + "입니다");
		
		//float는 보장하는 소숫점 자릿수는 7자리까지 맨끝은 반올림
	}
}
