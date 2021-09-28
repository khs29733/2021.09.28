package com.company.day002;

public class A001 {
	public static void main(String[] args) {
		System.out.println("변수");
		System.out.println("변하는 데이터를 저장하는 공간");
		
		//변수사용법
		//자료형	변수명
		//정수	: 1,10,20,...
		int purse;
		//System.out.println("지갑에 들어있는 돈 (0)" + purse);
		purse = 100000; //초기값을 주는것을 리터럴
		System.out.println("지갑에 들어있는 돈 (1) : " + purse);
		purse = 30000;	//A = B 대입(넣겠다)
		System.out.println("지갑에 들어있는 돈 (2) : " + purse);
		purse = 30000 - 12000;	//A = B(30000 - 12000 한다음에 purse에 넣기)
		System.out.println("지갑에 들어있는 돈 (3) : " + purse);
		
		////
		int a; a = 10; System.out.println(a);
		int b = 20; System.out.println(b);
		double c = 3.14; System.out.println(c);
	}//end main
}//end class
