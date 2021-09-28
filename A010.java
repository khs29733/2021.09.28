package com.company.project004;

import java.util.Scanner;

public class A010 {
	public static void main(String[] args) {
		//GIGO
		//공간(변수)
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("당신의 나이는? : ");
		a = scanner.nextInt();
		//처리
		//출력
		System.out.println("당신의 나이는 " + a + "살 입니다");
	}
}
