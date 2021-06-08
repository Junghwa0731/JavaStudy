package com.kh.chap01.comdition;

import java.util.Scanner;

/* ���α׷��� �⺻������ ���������� ���� ������
 * ���� �κ��� ���������� ���� �ؾ� �� ��, �Ǵ� �ݺ������� ���� �ؾ� �� ��
 * "���"�� �̿��Ѵ�
 * 
 * <���ǹ�>
 * ���ǽ��� ���� ������ ���������� �Ǵ��ؼ� �ش� ������ �����ϴ� ��� �׿� �ش��ϴ� ���๮�� ����
 *  > ���ǽ��� ����� true / false�� �����̿�����
 *  > �񱳿�����(��Һ�, �����), ��������(&&, ||)�� ���ǽĿ��� ����� 
 *  
 *  ���ǹ��� ũ�� if�� / switch������ ������ if���� ũ�� �������� ����
 *  1. �ܵ� if��
 *  2. if esle��
 *  3. if esle if esle��
 */


public class A_If {
	public void method1() {
		// ���, ����, 0�Ǻ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		}
		
		if(num < 0) {
			System.out.println("������");
		}
		
		if(num == 0) {
			System.out.println("0�̴�");
		}
	
	}
		
	public void method2() {	
		// ¦Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {    
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
			System.out.println("�׽�Ʈ1");
			System.out.println("�׽�Ʈ2");
		}
		
		if(num % 2 == 1) 
			System.out.print("�Է��� ���ڴ� Ȧ���Դϴ�.");
		
		// if ���� ������ ���๮�� 1���� ��� {} ���� ����
		// ���๮�� �������� ��찡 �����Ƿ� {} �ۼ��ϴ� ���� ���� Ȯ���ϱ� ����
		
	}
	
	public void method3() {
		// ������ �Է� �޾� ���л����� ���л����� �Ǻ�
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String student = " ";
		// ���������� �ݵ�� �ʱ�ȭ �Ǿ�߸� ��
		// �ʱ�ȭ ���� �ʰ����ϸ� ������ ���� �߻�
		// = "" ������ �����Ƿν� �ʱ�ȭ ��Ŵ
		
		if(gender == 'M' || gender == 'm') {
			student = "���л�";
		}
		

		if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}
		
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			// ���Ŀ� "�̴�" �� ��µǴµ� �� �� �Է� ���� ��쿡�� �ش� �ڵ带 �����ϰ� ���� �����Ƿ�
			// ȣ�� �� �޼ҵ带 ������ �� ����ϴ� return ������ �ۼ���
			return;
		}
		
		System.out.println(student + "�̴�.");
		
	}
	
	public void method4() {
		// ���� �Է� �޾� ���, û�ҳ� ���� �Ǹ�
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age =sc.nextInt();
		
		String result = "";
		
		if(age <= 13) {
			result = "���";
		}
		
		if(age > 13 && age <= 19) {
			result = "û�ҳ�";
		}
		
		if(age > 19) {
			result = "����";
		}
		
		System.out.println(result + "�Դϴ�.");
		
	}
	
	public void method5() {
		// �Է� �� �̸��� ������ �´��� Ȯ��
		
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		/*if(name == "����ȭ") {
			System.out.print("�����Դϴ�.");
		}
		
		if(name != "����ȭ") {
			System.out.print("������ �ƴմϴ�.");
		}
		*/
		
		// �⺻ �ڷ����� �񱳽ÿ� ==, != �� ����Ͽ� ���� �񱳸� �� �� ������
		//  String(���ڿ�)�� �⺻ �ڷ����� �ƴ� ���� �ڷ����̹Ƿ�
		//  String Ŭ�������� �����ϴ� equals() �޼ҵ带 ����ؼ� ���ؾ���
		
		if(name.equals("����ȭ")) {
			System.out.println("�����Դϴ�.");
		}
		if(!name.equals("����ȭ")) {
			System.out.println("������ �ƴմϴ�.");
		}
		
		
	}
	
	
	

}
