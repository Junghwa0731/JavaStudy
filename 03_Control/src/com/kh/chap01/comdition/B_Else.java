package com.kh.chap01.comdition;

import java.util.Scanner;

public class B_Else {
	
	public void method1() {
		// ���, ����, 0�Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����.");
		} else if(num < 0) {
			System.out.println("������.");
		} else /*if(num = 0)*/ {              // ������ �� Ȯ���߱� ������ ���� 0�̴� ��°� Ȯ�ξ��ص� ��
			System.out.println("0�̴�.");
		}
		
	}
	
	public void method2() {
		// ¦Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		} else {
			System.out.println("¦���Դϴ�.");
		}
			
	}

	public void method3() {
		// ���� �Է� �޾� ���л����� ���л����� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����(M/F): ");
		char gender = sc.next().charAt(0);
		
		String student = "";
		
		if(gender == 'M' || gender == 'm') {
			System.out.print("���л�");
		} else if(gender == 'F' || gender == 'f'){
			System.out.print("���л�");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;  //  > �޼ҵ� ���� ����
		}
		
		System.out.println(student + "�̴�.");
	}
	
	public void method4() {
		// ���̸� �Է� �޾� ���, û�ҳ�, ���� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int age = sc.nextInt();
		
		String result = "";
		
		if(age <= 13) {
			result = "���";
		} else if(/*age > 13 &&*/ age <= 19){
			// if - else if ������ ���� ���� ������ �������� ���ϰ� ���¿Ա� ������
			// �翬�� ���� ������ �ݴ� ������ ���������� �����ϰ� ����
			result = "û�ҳ�";
		} else {
			result = "����";
		}
		System.out.println(result);
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		// String(������) �� �� �ÿ��� ==, !== ���Ұ�
		// String Ŭ�������� �����ϴ� equals() �޼ҵ� ���
		
		if(name.equals("�캰��")) {
			System.out.println("�����̴�.");
		} else {
			System.out.println("������ �ƴϴ�.");
		}
		
	}
	
	public void method6() {
		// ����ڿ��� ������ �Է� �޾�
		// �������� ����� ���� ������ ������ ����ϴ� �޼ҵ�
		
		// 90���̻�  > A���
		// 90���̸� 80���̻� > B���
		// 80���̸� 70���̻� > C���
		// 70���̸� 60���̻� > D���
		// 60���̸� F���
        Scanner sc = new Scanner(System.in);		
		System.out.print("����: ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("����� ������ "+ score + "�̰�, ����� "+ grade + "�Դϴ�." );
	 
	}
	
	public void method7() {
		// ���� ������ �� ��޺� �߰� ���� �̻��� ��쿡��
		// ��޿� "+"��� ���ڸ� �߰��Ͽ� ���
		// ��) 95���̻��� A+
		Scanner sc = new Scanner(System.in);		
		System.out.print("����: ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score > 100 || score < 0) {
			System.out.println("�߸� �� ������ ���� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		
		if(score >= 90) {
			grade = "A";
			
			if(score >= 95) {
				grade += "+";
			}
		} else if(score >= 80) {
			grade = "B";
			
			if(score >= 85) {
				grade += "+";
			}
		} else if(score >= 70) {
			grade = "C";
			
			if(score >= 75) {
				grade += "+";
			}
		} else if(score >= 60) {
			grade = "D";
			
			if(score >= 65) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		
		System.out.println("����� ������ "+ score + "�̰�, ����� "+ grade + "�Դϴ�." );
	 
		
	}
	
	
}
