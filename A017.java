package com.company.project004;

public class A017 {
	public static void main(String[] args) {
		// (1). 자동형변환
		// byte(1) < short(2), char(2) < int(4) < long(8) < float(4) < double(8)
		byte b = 1;
		int i = 2;
		long l = 3L;
		boolean bl = true;
		float f = 1.1f; double d=1.1;
		
//		bl= b; //1.boolean뺴고 7개의 자료형이 변환가능하다.
		i=b;	//2. i(4byte) = b(1byte) *사이즈 체크
//		i=l;	//3. i(4byte) = L(8byte) 해결방법 : 강제형변환을 해야한다
		l=i;	//4. l(8byte) = i(4byte)
//		f=d;	//5. f(4byte) = d(8byte) 해결방법 : 강제형변환
		d=f;	//6. d(8byte) = f(4byte)
		f=l;	//7. f(4byte) = l(8byte) 실수는 정수보다크다
		
		
		// (2). 강제형변환
		System.out.println(10/3);	//3	정수/정수의 결과는 정수
		System.out.println(10/3.0);	//3.3333333333333335 정수(int)/실수(double)의 결과는 실수	
		System.out.println(10.0/3);	//3.3333333333333335 실수(double)/정수(int)의 결과는 실수
		int ca = 10, cb=3;
		System.out.println((float)10/3);//3.3333333
		System.out.println((float)ca/cb);//3.3333333
		System.out.println(ca/(float)cb);
		//q1) 1.5+2.7 -> 결과물 3이 나오게
		System.out.println((int)1.5+(int)2.7);
		//q2) 1.5+2.7 -> 결과물 4가 나오게
		System.out.println((int)(1.5+2.7));



		
	
	}
}	
