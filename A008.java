package com.company.project004;

public class A008 {
	public static void main(String[] args) {
		// 자바에서의 자료형  (1) 기본자료형		
		// 기본자료형 : 실제 값을 저장
		// 1.논리형 : boolean(1byte, (true(맞다) / false(틀리다))
		// 2.정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		// 3.실수형 : float(4byte), double(8byte)
		// 4.문자형 : char(2byte)
	
		int a = 10;		//a[  10  ]
		double b = 3.14;//b[ 3.14 ]
		
		boolean b1 = true;	System.out.println(b1);//연산자, 비교등등 많이 사용
		byte by = 1;	short sh = 2;	int i = 4;	long l = 8L;//*주의사항 :	long 끝에 L붙이기
		
		float fl = 3.14F;	//*주의사항 : F를 안붙이면 double이 float으로 가기 때문에 오류 *F붙이기
		double d = 3.14;
		
		char ch = 'A';//문자한개
		char ch2 = ' ';//오류나는 이유는? -> 문자는 문자인데 아무것도 안들어가있어서 / ''사이에 공백넣기(space바 가능)
		
		
		
		// 자바에서의 자료형  (2) 참조형
		// 참조자료형 : 주소값을 가짐
		// 5.문자열형 (기본자료형은 아니지만 많이 써서 붙임)
		String abc = "Hello";
		
	}
}
