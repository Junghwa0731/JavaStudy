package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break  : ���� ����� �ݺ����� ���������� ����
	// switch�� break�� switch���� ���������� break��
	// �ݺ������� ���̴� break�ʹ� �ٸ�
	
	public void method1() {
		// "exid" �Է� ������ ���ڿ��� ��� �Է� �޾� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if(str.equals("exit"))
				break;  // ���� ���� �ݺ����� ��������
			
			System.out.println("�Է� ���� ���ڿ�  : " + str);
		}
	}
	
	public void method2() {
		// 1���� ����ڰ� �Է��� ���ڱ��� �հ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		int sum = 0;
		// for�� (���ѷ���)
		for(int i = 1; ; i++) {
			sum += i;
			if(i == num)
				break;
		}
		System.out.println("�հ� : " + sum);
	}
	
	public void method3() {
		// ����ڿ��� �ݺ������� ���� �� ���� �����ȣ(����)�� �Է� �ް�
		// �׿� �ش��ϴ� ��� ���'
		// ���� ���� �� ���� ��ȣ�� �ƴ� �ٸ� ��ȣ �Է½� "�߸� �Է��Ͽ����ϴ�" ��� �� �ݺ� ����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("���� 2 : ");
			int num2 = sc.nextInt();
			
			System.out.print("���� ��ȣ(+ �Ǵ� -) : ");
			String op = sc.next();
			
			int result = 0; // ���� ��� ���� ����
			
			if(op.equals("+")) {
				result = num1+num2;
			} else if(op.equals("-")) {
				result = num1-num2;
			} else {
				System.out.println("���� ��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			System.out.println("result : " + result);
		}
		
		
	}

}
