package com.company.project004;

public class A017 {
	public static void main(String[] args) {
		// (1). �ڵ�����ȯ
		// byte(1) < short(2), char(2) < int(4) < long(8) < float(4) < double(8)
		byte b = 1;
		int i = 2;
		long l = 3L;
		boolean bl = true;
		float f = 1.1f; double d=1.1;
		
//		bl= b; //1.boolean���� 7���� �ڷ����� ��ȯ�����ϴ�.
		i=b;	//2. i(4byte) = b(1byte) *������ üũ
//		i=l;	//3. i(4byte) = L(8byte) �ذ��� : ��������ȯ�� �ؾ��Ѵ�
		l=i;	//4. l(8byte) = i(4byte)
//		f=d;	//5. f(4byte) = d(8byte) �ذ��� : ��������ȯ
		d=f;	//6. d(8byte) = f(4byte)
		f=l;	//7. f(4byte) = l(8byte) �Ǽ��� ��������ũ��
		
		
		// (2). ��������ȯ
		System.out.println(10/3);	//3	����/������ ����� ����
		System.out.println(10/3.0);	//3.3333333333333335 ����(int)/�Ǽ�(double)�� ����� �Ǽ�	
		System.out.println(10.0/3);	//3.3333333333333335 �Ǽ�(double)/����(int)�� ����� �Ǽ�
		int ca = 10, cb=3;
		System.out.println((float)10/3);//3.3333333
		System.out.println((float)ca/cb);//3.3333333
		System.out.println(ca/(float)cb);
		//q1) 1.5+2.7 -> ����� 3�� ������
		System.out.println((int)1.5+(int)2.7);
		//q2) 1.5+2.7 -> ����� 4�� ������
		System.out.println((int)(1.5+2.7));



		
	
	}
}	
