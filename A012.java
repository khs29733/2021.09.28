package com.company.project004;

import java.util.Scanner;

public class A012 {
	public static void main(String[] args) {
		//GIGO
		//변수
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0; int result = 0;
		//입력
		System.out.println("더하기 프로그램입니다");
		System.out.println("숫자1 입력 : ");
		a = scanner.nextInt();
		System.out.println("숫자2 입력 : ");
		b = scanner.nextInt();
		//처리
		result = a+b; //A = B B를 작업해서 A에 넣겠다/B(a+b)를 해서 result에 넣기
		//출력
		System.out.println("결과 : " + a + "+" + b + "=" + (a+b));
		

	}
}
