package com.kh.operator;

public class F_Compound {
	// ���� ���� ������ : ��� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
	// ���� ó�� �ӵ��� �ξ� �����Ƿ� ��� ������
	
	public void method() {
		int num = 12;
		
		System.out.println("num : " + num);
		
		num += 3;
		System.out.println("3 ������Ų num : " + num);  //15
		
		num -= 5;
		System.out.println("5 ���ҽ�Ų num : " + num);  //10
		
		num *= 6;
		System.out.println("6�� ������Ų num : " + num);  //60
		
		num /= 2;
		System.out.println("2�� ���ҽ�Ų num : " + num);  //30
		
		num %= 4;
		System.out.println("num�� 4�� ���� ������ : " + num);  //2
		
		
		
		
	}

}
