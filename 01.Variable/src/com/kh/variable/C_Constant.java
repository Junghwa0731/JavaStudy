package com.kh.variable;

public class C_Constant {
	
	public void final1Constant() {
		// ��� �׽�Ʈ
		
		int age = 20;
		final int AGE = 20;
		
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		// �� ���� �׽�Ʈ
		age = 30;
		// AGE = 30; > ���� �߻� : ����� �� �� ���� �� ���� �������� ����
		
		System.out.println("���� �� age: " + age);
		System.out.println("������ �� ���� AGE : " + AGE);
		
		
	}

}
