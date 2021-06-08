package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/* �ݺ��� : ���α׷� ���� �帧�� �����ϴ� ��� �� �ϳ���
	 * ���� �ڵ带 �ݺ������� ���� ������
	 * for���� while (do-while��) �� ������ ����
	 */
	
	/* for(�ʱ��; ���ǽ�; ������) {
	 *      ������ �ڵ�;
	 * }
	 */
	
	public void method1() {
		// "�ȳ��ϼ���" 10�� ���
		// System.out.println("�ȳ��ϼ���"); ������ �� ������ 10�� ��������� for�̿��ϸ� ������ �ۼ�����
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("�ȳ��ϼ���");		
		}
		
	}
	
	public void method2() {
		// 1���� 5���� ���
		for(int i = 1; i <=5; i++) {    // ������ ++����/����++ ���� ��� ����  > �ٸ� ���� ���� i�� �������̹Ƿ�
			System.out.print(i + " ");  // + " " �� ���ڸ��� ���� �Ҷ� ���
		}	
	}
	public void method3() {
		// 5���� 1���� ���
		// ����(++) ������ �Ӹ� �ƴ϶� ����(--)�����ڵ� ����
		for(int i = 5; i >= 1; i--)
			System.out.print(i + " "); 
	}
	
	public void method4() {
		// 1���� 10 ������ Ȧ�� ���
		// 1 3 5 7 9
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		
		for(int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method5() {
		// 1���� 10������ ������ �հ� ���ϱ�
		// 1+2+3+...+9+10
		int sum = 0;    // �հ� ���� ������ ����
		for(int i = 1; i <= 10; i++) {
			sum += i;  // sum = sum + i ������
		}
		System.out.print("�հ� : " + sum);
		
	}
	
	public void method6() {
		// 1���� ����ڰ� Ű����� �Է��� �������� �հ�
		Scanner sc = new Scanner(System.in);		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		int sum = 0;   // �հ� ���� ������ ����
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.print("1���� " + num + "������ �հ� : " + sum);
		
	}
	
	public void method7() {
		// ������ 2�� ����ϱ�
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		for(int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		
	}
	
	public void method8() {
		// ����ڿ��� �Է� ���� ���� �ش��ϴ� ������ ����ϱ�
		// ����ڰ� �Է��� ���ڰ� 2~9 ���̰� �´��� Ȯ���ؼ� ���� ��츸 ������ ���
		// �ƴ� ��� 2~9 ������ ���� �Է��Ͼ��մϴ� ���
		// ��¹��� printf�� �ۼ��غα�
		Scanner sc = new Scanner(System.in);		
		System.out.print("����(2~9)������ �� �Է�: ");
		int num = sc.nextInt();
		
		if (num > 1 && num < 10) {
			for(int i = 1; i < 10; i++) {
			//System.out.println(num + " * " + i + " = " + num * i);
			System.out.printf("%d * %d = %d\n",num, i,(num * i));
			}
			
		} else {
			System.out.print("2~9 ������ ���� �Է��Ͼ��մϴ�.");
		}
	}
	
	public void method9() {
		// ���� �� �߻� ��Ű��
		// 1~10 ������ ���� ���߻����Ѽ� 1~random�������� �հ� ���ϱ�
		
		// java.lang.Math Ŭ������ �����ϴ� random() �޼ҵ�
		// java.lang ��Ű���� import ó���� ���ʿ�
		// > �����Ϸ��� ���� import java.lang.*; ������ ����
		
		double random = Math.random();
		System.out.println(random);
		// Math.random() > 0.0 ~ 0.99999 ������ ������ �߻�
		
		// 0.0 * 10 <- Math.random() * 10 < 1.0 * 10          => ���ϴ� �������� ������ŭ ���Ѵ�
		// 0.0 + 1 <- Math.random() * 10 + 1 < 10.0 + 1       => ���ϴ� ���۰���ŭ ���Ѵ�
		// 1 <- (int)(Math.random() * 10) + 1 < 11            => �Ҽ��� ���Ÿ� ���� int�� ����ȯ
		
		int ran = (int)(Math.random() * 10) + 1;
		System.out.println(ran);	
		
		int sum = 0;   // �հ� ���� ���� ����
		for(int i = 1; i <= ran; i++) {
			sum += i;
		}
		System.out.println("1���� " + ran + "������ �� : " + sum);
	}
	
	public void method10() {
		// ���� ������
		// 2~9 ������ �������� random ������ ��� random ������ ���
		int random = (int)(Math.random() * 8 + 2);
		
		System.out.println("=== " + random + "�� ===");
		for(int i = 1; i <= 9; i++) {
			System.out.println(random + " x " + i + " = " + random * i);

		}
		
	}
	
	public void method11() {
		// ����ڿ��� �� ���� ���� �� �Է� �޾�
		// ���� ������ ū �������� �հ� ���ϱ�
		Scanner sc = new Scanner(System.in);		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		/*
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(num1 + "���� " + num2 + "������ �հ� : " + sum);
		*/
		// num1�� ���� �� num2�� ū ���� ���� ���� ������
		// num1�� ū �� num2�� ���� ���� ���� �ݺ��� ���� �������� �ʾ� �հ踦 ���� �� ����

		int min = 0;   // �Է� �� ���� �� ���� ���� ������ ����
		int max = 0;   // �Է� �� ���� �� ū ���� ������ ����
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(min + "���� " + max + "������ �հ� : " + sum);
		
		}
		
	//--------------------��ø �ݸ�--------------------
		/* ��ø for��
		 * 
		 * for(�ʱ��1; ���ǽ�1; ������1) {
		 *      ������ �ڵ�1;
		 *      for(�ʱ��2; ���ǽ�2; ������2) {
		 *          ������ �ڵ�2;
		 *      }
		 *      ������ �ڵ�3;    
		 * }
		 */
		
		public void method12() {
			// 1���� 5���� ��� �Ǵ� ������ 3�� ����ϱ�
			// 1 2 3 4 5
			// 1 2 3 4 5
			// 1 2 3 4 5
			for(int i = 1; i <= 3; i++) {    // 1~5���� �ݺ��Ȱ� 3�� �ݺ�
				for(int j = 1; j <= 5; j++) {   // 1~5���� �ݺ�
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		
		public void method13() {
			// 0�� 0�� ~ 23�� 59�� ���
			// ��  > 0�ú��� 23�ñ��� ����   -- > �ܺ� for��
			// ��  > 0�к��� 59�б��� ����   -- > ���� for��
			
			for(int hour = 0; hour <= 23; hour++) {    // ���� �����ñ�� for��
				for(int min = 0; min <= 59; min++) {   // ���� �����ñ�� for��
					System.out.println(hour + "�� " + min + "��");
				}
			}
		}
		
		public void method14() {
			// 2�ܺ��� 9�ܱ��� ���
			// ��  > 2���� 9���� ����   --> �ܺ� for��
			// ��  > 1���� 9���� ����   --> ���� for��
			
			for(int dan = 2; dan <= 9; dan++) { 
				System.out.println();
				System.out.println("==== " + dan + "�� =====");
				for(int su = 1; su <= 9; su++) {   
					System.out.println(dan + " x " + su + " = " + dan * su);
				}
				System.out.println("=============");
			}
			
		}
		
		public void method15() {
			//  ****
		    //  ****
		    //  ****
		    //  ****
		    //  ****
			
			// �� ����  --> �ܺ� for��
			// �� ����  --> ���� for��
			for(int i = 1; i <= 5; i++) {    
				for(int j = 1; j <= 4; j++) {   
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void method16() {
		    //  1***
		    //  *2**
		    //  **3*
		    //  ***4
			for(int i = 1; i <= 4; i++) {    
				for(int j = 1; j <= 4; j++) {  
					if(i == j)
						System.out.print(i);
					else
					    System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		
	
	
		
}
