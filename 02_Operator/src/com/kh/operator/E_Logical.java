package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// �� ������
	// �� ���� �� ���� �����ϴ� ������
	// &&(and), ||(or)
	
	public void method1() {
		// ����ڰ� �Է��� ���� ���� 1���� 100 ������ ������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		boolean isTrue;
		// isTrue = (1 <= num <= 100)  �̰� ������ �ΰ��� �̷��� ��� �Ұ��� > �������� �̿�
		isTrue = (num >= 1) && (num <= 100);
		
		System.out.println("����ڰ� �Է��� ���� 1���� 100 �����Դϱ� : " + isTrue);
		// && : �ΰ��� ������ ��� true ���� && ������ ������� true
		//      �ϳ��� ������ false�� �ȴٸ� && ������ ��� ���� false
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� ���� ���� ���� �빮������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		// ���� �ϳ� �Է� �ޱ�
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' ~ 'Z' �� �ش��ϴ� �����ڵ� ���� 65 ~ 90
		// boolean isTrue = (ch >= 65) && (ch <= 90);  �Ʒ��� �Ѵ� ��밡��
		boolean isTrue = (ch >= 'A') && (ch <= 'Z');
		System.out.println("����ڰ� �Է��� ���� �빮���Դϱ� : " + isTrue);
		
	}
	
	public void method3() {
		// ����ڿ��� ���α׷� ���� ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Ͻ÷��� y �Ǵ� Y�� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isTrue = (ch == 'y') || (ch == 'Y');
	
		System.out.println("����ڰ� �Է��� ���� y �Ǵ� Y�Դϱ� : " + isTrue);
		// || : �ΰ��� ���� �� �ϳ��� true �� �ִٸ� || ������ ������� true 
		//      �ΰ��� ���� ��� false�� ��� || ������ ��� ���� false
	}
	
	public void method4() {
		int num = 10;
		System.out.println("&& ���� ���� num �� : " + num);
		
		boolean result1 = false && ++num > 0;  // ++num > 0 �� ������� �ǹ̴� ��� 
		
		System.out.println("result1 : " + result1);
		System.out.println("&& ���� ���� num �� : " + num);
		// && ������ �տ� �̹� f �� �����Ƿ� ���� ������ �������� �ʾƵ� ��ü ��� f �� �Ǻ�����
		// ���� ++num �� ������ ������� �ʴ´�  > Dead code��� ���â Ȯ�� ����
		
		System.out.println();
		
		boolean result2 = true || ++num < 0;
		System.out.println("result2 : " + result2);
		System.out.println("|| ���� ���� num �� : " + num);
		// || ������ �տ� �̹� true�� �����Ƿ� ���� ������ �������� �ʾƵ� ��ü ��� t �� �Ǻ�����
		// ���� ++num �� ������ ������� �ʴ´�  >  Dead code��� ���â Ȯ�� ����
		
		
	}
	
	
	
	
	
}
