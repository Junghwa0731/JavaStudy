package com.kh.operator;

public class D_Comparison {
	
	
	// ---------< ���� 3���� >
	
	// �� ������ (���� ������)
	// > �� ���� ���ϴ� ������, �ٸ� ���� ���� �����ڶ���� ��
	//   �� �����ڴ� ������ �����ϸ� true(��), �������� ������ false(����)�� ��ȯ��
	
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		boolean result1 = (a == b);
		boolean result2 = (a <= b);
		boolean result3 = (a > b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("a�� ¦���ΰ� : " + (a % 2 == 0));   // a�� 2�� �������� ������ ���� 0�̸� ��
		System.out.println("b�� Ȧ���ΰ� : " + (b % 2 == 1));   // ���ٶ�� ǥ�� == 
		
		System.out.println("a�� ¦���ΰ� : " + (a % 2 != 1));   //  != �� ���� �ϸ� �ȵ� 
		System.out.println("b�� Ȧ���ΰ� : " + (b % 2 != 0));
		
				
				
		
	}

}