package com.company.project004;

import java.util.Scanner;	//2. Scanner 클래스 사용하기 위해 추가

// 목표 : 입력받는 부품(클래스) 사용하기
// 자바팀에서 만들어놨음
// 형식이 있음

public class A009 {
	public static void main(String[] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);	//1.ctrl + shift + o
		//부품(객체)를 가져다사용할때는 단순한 값이 아니라 기능 및 변수들이 묶여져 있어서 공간을 필요로함
		//객체사용하기 1) new로 공간빌리기	2) 객체만든 변수,기능()
		a = 10;//비교 //a에 10대입
		System.out.println("좋아하는 숫자를 입력해주세요 > ");
		a = scanner.nextInt();//a라는 공간에 scanner기능을 이용해 입력받은 숫자 대입
		System.out.println("좋아하는 숫자는 : " + a + "입니다.");
	}
}
