package com.company.project004;

import java.util.Scanner;

public class A019 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, total = 0;
		float avg = 0.0F;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total/3;
		
		System.out.println("::::::::::::::::::::::");
		System.out.println("::GREEN IT SCORE::");
		System.out.println("::::::::::::::::::::::");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(total + "\t");
		System.out.print(avg);
	}
}
