package com.company.project004;

import java.util.Scanner;

public class A019 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, total = 0;
		float avg = 0.0F;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �Է� : ");
		kor = sc.nextInt();
		System.out.println("�������� �Է� : ");
		eng = sc.nextInt();
		System.out.println("�������� �Է� : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total/3;
		
		System.out.println("::::::::::::::::::::::");
		System.out.println("::GREEN IT SCORE::");
		System.out.println("::::::::::::::::::::::");
		System.out.println("����\t����\t����\t����\t���");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(total + "\t");
		System.out.print(avg);
	}
}
