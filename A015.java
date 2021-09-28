package com.company.project004;

import java.util.Scanner;

public class A015 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		double a = 0.0F;
		
		System.out.println("성적을 입력해주세요 : ");
		a = sc.nextDouble();
		System.out.println("당신의 성적은 " + a + "입니다");
		//double은 소숫점 14자리까지 나옴
	}
}
