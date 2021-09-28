package com.company.project004;

import java.util.Scanner;

public class A016 {
	public static void main(String[] args) {
		//gigo
		//변수
		Scanner sc = new Scanner(System.in);
		double kor = 0.0, math = 0.0, eng = 0.0;
		
		//입력
		System.out.println("국어점수 입력 : ");
		kor = sc.nextDouble();
		System.out.println("수학점수 입력 : ");
		math = sc.nextDouble();
		System.out.println("영어점수 입력 : ");
		eng = sc.nextDouble();
		
		//처리
		double sum = kor + math + eng;
		double avg = sum / 3;
		
		//출력		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
	}
}
