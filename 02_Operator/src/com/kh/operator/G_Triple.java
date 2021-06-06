package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������: �׸��� 3���� ������
	// (���ǽ�) ? (���ǽ��� ���� ����� ��1) : (���ǽ��� ������ ����� ��2);
	// ���⼭ ���ǽ��� t or f �����ϳ��� ������ ��
	

	public void method1() {
		// �Է� ���� ������ ������� �ƴ��� �Ǻ� �� ���
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "����̴�" : "�����̴�";
		
		System.out.print(num + "�� " + result);
		
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� ���� ���� Ȧ������ ¦������ �Ǻ� �� ���
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦���̴�" : "Ȧ���̴�";
		
		System.out.print(num + "�� " + result);
		
	}

	public void method3() {
		// ����ڿ��� �� ���� ���� �� �Է� �޾Ƽ�
		// �� ���� ���� ���� ����� 100���� ū ��� "����� 100 �̻��Դϴ�."
		//                         �ƴ� ��� "����� 100 ���� �۽��ϴ�."
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("������1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("������2 : ");
		int num2 = sc.nextInt();
		
		String result = (num1 * num2 >= 100) ? "����� 100 �̻��Դϴ�." : "����� 100 ���� �۽��ϴ�.";
		
		System.out.print(num1 * num2 + "�� " + result);
		
	}
	 
	public void method4() {
		// ���� ������ ��ø ���
		// �Է� ���� ������ 0���� 0�� �ƴ��� �Ǻ��� ��
		// 0�� �ƴ� ��� ������� �������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0�̴�" : ((num > 0) ? "����̴�" : "�����̴�");
				
		System.out.print(num  + "�� " + result);
	}
	
	public void method5() {
		// �� ���� �Է� �ް�
		// + �Ǵ� -�� �Է¹޾� �˸��� ��� ����� ����ϱ�
		// �� + �Ǵ� - ���� �ٸ� ���ڸ� �Է��ϴ� ��� "�߸� �Է��ϼ̺�ϴ�" ���
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° �� : ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		
		System.out.print("������ �Է�(+ �Ǵ� -) : ");
		char op = sc.next().charAt(0);     // sc.nextLine() ���� �ٸ� �޼ҵ尡 ������ ���Ͱ� �о������ 
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "�߸� �Է��ϼ̽��ϴ�.";
		
		System.out.print("��� : " + result);
		
		
		
		
		
		
		
	}
	
}
