package com.kh.operator;

public class B_InDecrease {
	
	// ���� ������
	// ++ : 1 ������Ű�� ������
	//      ++�� (���� ������), ��++ (���� ������)
	// -- : 1 ���ҽ�Ű�� ������
	//      --�� (���� ������), ��-- (���� ������)
	
	public void method() {
		// ���� ����
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a + ", b : " + b);
		
		// ���� ����
		
		int c = 10;
		int d = c++;
		
		System.out.println("c : " + c + ", d : " + d);
		
		int num1 = 20;
		int result = num1++ * 3;
	
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
		
	}
	
	public void method2() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);   // a : 10(11)  ���⼭ ����� 10���� �� ������ ����� ++ ��꺸�� �������� ����� 10���� �ǰ�, a�� ������ �ִ� ���� 11�� ��
		
		System.out.println((++a) + (b++));   // a : 12, b : 20(21)> 12+20 �̹Ƿ� 32 ��µ� �� b�� 21�� ���� �����Ե� 
		
		System.out.println((a++) + (--b) + (--c));   // a : 12(13), b : 20, c : 29 > 61 ���
		
		System.out.println("a : " + a);  // 13
		System.out.println("b : " + b);  // 20
		System.out.println("c : " + c);  // 29
		
		
		
		
	}

}
