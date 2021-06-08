package com.kh.chap02.loop;

import java.util.Scanner;

   //  -------<5���� ����>

public class B_Whlie {
	/* whlie��
	 * 
	 * [�ʱ��]
	 * whlie(���ǽ�) {
	 *        �������ڵ�;
	 *        [������ or �б⹮]
	 * 
	 * }
	 * */
	
	public void method1() {
		// "�ȳ��ϼ���" 10�� ���
		
		int i = 1;  //�ʱ��
		while(i	<= 10) {  //���ǽ�
			System.out.println("�ȳ��ϼ���");
			i++;   // ������
		}	
		
		// 1���� 10���� ���
		i = 1;  //�ʱ��   ( ���������� �������� i�� 11�� �Ǿ������Ƿ� 1�� �ʱ�ȭ)
		while(i	<= 10) {  //���ǽ�
			System.out.print(i + " ");
			i++;   // ������
		}
	}
	
	public void method2() {
		// 10���� 1���� ���� ���
		int i = 10;  //�ʱ��
		while(i	>= 1) {  //���ǽ�
			System.out.print(i + " ");
			i--;   // ������
		}	
		
		
	}
	
	public void method3() {
		// 1���� 10������ Ȧ���� ���
		// 1 3 5 7 9
		int i = 1;  //�ʱ��
		while(i	<= 10) {  //���ǽ�
			System.out.print(i + " ");
			i += 2;   // ������
		}	
	}
	
	public void method4() {
		// ����ڷκ��� �Է� ���� ���� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int dan= sc.nextInt();
		
		// �Է� �� dan�� 2~9 ������ ������Ȯ��
		if(dan >= 2 && dan <= 9) {
			int i = 1;  //�ʱ��
			while(i	<= 9) {  //���ǽ�
				System.out.print(dan + " X "+ i + " = " + dan * i);
				i++;   // ������		
		} 
		}	else {
			System.out.println("2~9 ������ ���� �Է��ؾ� �մϴ�. : ");
		}
	}
	
	public void method5() {
		// 1���� ������ (50~100)������ �հ� ���ϱ�
		int random = (int)(Math.random() * 51) + 50;
		int sum = 0;
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.print("1���� "+ random + "������ �� : " + sum);
		
	}
	
	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �� �ε����� ���ڸ� �и��ؼ� ���
		// "apple"
		//  a
		//  p
		//  p
		//  l
		//  e
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println("���ڿ��� ���� : " + str.length());  //str.length() �ش� ���ڿ��� ���� �˷���
		
		// str.charAt(0)
		// str.charAt(1)
		//  ...
		// str.charAt(���ڿ��� ���� -1)
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
	
	// ---------------------- ��ø �ݺ��� --------------------------------
	public void method7() {
		// ������ 2�ܺ��� 9�ܱ��� ���
		int dan = 2;
		while(dan <= 9) {
			int su = 1;   // �ʱ�� ��ġ �߿�. �ݺ��ϰ� 1�� ���µǾ��
			while(su <= 9) {
				System.out.println(dan + " x " + su + " = "+ dan * su);
				su++;  // ������ ��ġ �߿�
			}
			dan++;  // ������ ��ġ �߿�
		 }
	}
	
	public void method8() {
		// for���� 0�� 0�� ~ 23�� 59�� ����� while�� ��ø����
		// ����� printf��
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%2d�� %2d��\n", hour, min);
				min++;
			}
			hour++;
		}
	}
	
	// > ������ Ƚ����ū �ݺ��ϰ��� �� ���� for���� �̿��ϴ� ���� ��
	// > while���� ��� ���ǿ� ���� �ݺ��� ������ ���θ� �Ѵ��ϴµ�Ȱ��
	// ex. �޴��� ����� ����ؼ� ���α׷��� ����
	
	public void method9() {
		Scanner sc = new Scanner(System.in);	
		
		// while���� ���ǿ� true�� ������ ����ؼ� �ݺ��ϴ� ���� ������ ���� �� ����
		while(true) {     // while(true) ���ѹݺ� 
			System.out.println();
			System.out.println("----�޴�----");
			System.out.println("1. 1���� 10���� ���");
			System.out.println("2. 10���� 1���� ���");
			System.out.println("3. 1���� 10���� Ȧ�� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				method1();
				break;
			case 2 :
				method2();
				break;
			case 3 :
				method3();
				break;
			case 9 :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public void method10() {
		// ���ڿ� �Է� �ް� �� ���ڿ��� exit�� �ƴҶ� ���� �ݺ�
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(!str.equals("exit")) {
			System.out.print("���ڿ��� �Է����ּ��� : ");
			str = sc.nextLine();
			System.out.println("�Է� �� ���ڿ� : " + str);
		}
		System.out.println("exit �Է����� ����Ǿ����ϴ�.");
	}
	
	
	
	

}
