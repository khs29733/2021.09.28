package com.company.project004;

public class A007 {
	public static void main(String[] args) {
		int a = 10;
		int b =3;
		
		System.out.println("10 + 3 = " + (a+b));
		System.out.println(a + " + " + b + " = " + (a+b));
		
		System.out.println("10 - 3 = " + (a-b));
		System.out.println(a + " - " + b + " = " + (a-b));
		
		System.out.println("10 * 3 = " + (a*b));
		System.out.println(a + " * " + b + " = " + (a*b));
		
		System.out.println("10 / 3 = " + (a/b));		
		System.out.println(a + " / " + b + " / " + (a/b));
		//결과가 안나오는 이유는 int a나 int b둘중에 하나가 double로 바껴야함(형변환)
		
		
		
		

	}
}
