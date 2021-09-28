package com.company.project004;

import java.util.Scanner;

public class A018 {
	public static void main(String[] args) {
		//GIGO 입력 받을 정수형변수 2개, 결과를 담을 실수형 변수를 만드시오
		int enum1=0, enum2=0; float result = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력 : ");
		enum1 = sc.nextInt();
		System.out.println("숫자2 입력 : ");
		enum2 = sc.nextInt();
		
		result = (enum1 + enum2) / 2;
		System.out.println("나누기 결과 :" + result );
	}
}
