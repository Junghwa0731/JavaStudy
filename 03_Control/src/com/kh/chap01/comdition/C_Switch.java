package com.kh.chap01.comdition;

import java.util.Scanner;

public class C_Switch {
	public void method1() {
		// 1~3 ������ ������ �Է� �޾�
		// 1 > ������, 2 > �Ķ���, 3 > �ʷϻ� �Դϴ� ���
		// �� ���� �Է��� �߸� �Է��Ͽ����ϴ� ���
		Scanner sc = new Scanner(System.in);		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("�������Դϴ�.");
			break;
		case 2 :
			System.out.println("�Ķ����Դϴ�.");
			break;	
		case 3 :
			System.out.println("�ʷϻ��Դϴ�.");
			break;	
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("���� �̸��� �Է��Ͻÿ�: ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "���" :
			price = 1000;
			break;
		case "�ٳ���" :
			price = 3000;
			break;
		case "Ű��" :
			price = 4000;
			break;
		default :
			System.out.println("�� �Ⱦƿ�~");
			return;		
		}		
		System.out.println(fruit+ "�� ������ " + price + "�� �Դϴ�.");
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȸ�� ���(1/2/3)�� �Է��ϼ���: ");
		int level = sc.nextInt();
		
		if(level == 3) {
			System.out.println("�Ŵ��� ����̴�.");
		} else if(level == 2) {
			System.out.println("�Ϲ� ȸ�� ����Դϴ�.");
		} else {
			System.out.println("���� ȸ�� ��޴ϴ�.");
		}	
		
		switch(level) {
		case 3 :
			System.out.println("���� ������ �ֽ��ϴ�.");
		case 2 :
			System.out.println("�۾��� ������ �ֽ��ϴ�.");
		case 1 :
			System.out.println("���б� ������ �ֽ��ϴ�.");
		
		}
		
		
		
		
	}
	
	
	
	
	

}
