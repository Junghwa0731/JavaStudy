package com.kh.variable;

public class E_Overflow {
	
	public void overflow() {
		// byte �ڷ��� �� ���� ���� : -128 ~ 127
		
		// byte bNum = 128; > ����, ������ ��� ����
		// Type mismatch : cannot convert from int to byte
		// : �������� �⺻�� int, �������� ������ �� �� �⺻���� int�� ��
		// byte�� ���� �� �ִ� ���� ����� �˾Ƽ� �ٿ��� ���� ����������
		// ������ �Ѿ�ٸ� �ڷ� �ս��� �Ͼ� �� �� �ֱ� ������ ������ ��
		
		byte bNum = 127;  // byte �ִ밪���� �ʱ�ȭ
		System.out.println("bNum: " + bNum);
		
		bNum = (byte)(bNum + 1);
		System.out.println("bNum: " + bNum);
		
	}
	
	public void cale() {
		int num1 = 1000000;
		int num2 = 700000;
		
		int multi = num1 * num2;
		System.out.println("��� ��� : " + multi);	
		// 70000000000�� ���;� ������ �����÷��� ������ ��� ���� ���� (��� ��� : -79669248) �� �߻�
		
		// ���� ������ �̸� �˰� �̸� �����Ͽ� �� ū �ڷ������� �������ָ� �ذ� ����
		long multi2 = (long)num1 * num2;  // long multi2 = num1 * num2; long���� 	���� ���������� '��� ��� : -79669248' ������ ���� 
		                                  // > num1 * num2 ���� �̹� �����÷ο찡 �߻���. multi2�� �־���� �̹� �߻��Ǽ� ���� ���������� �ȳ���
		                                  // �׷��� �߻��� �� �ݵ�� ���ϱ� ������ �Ͼ�� ���� ����ȯ ���־�� ��
		System.out.println("��� ��� : " + multi2);
	
		
	}
	
	

}
