package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1(){
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
        String result = (num > 0) ? "�����" : "����� �ƴϴ�";
		
		System.out.print(result);
	}
	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0�̴�" : ((num > 0) ? "�����" : "������");
		
		System.out.print(result);
		
	}

	public void practice3() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦����" : "Ȧ����";
		
		System.out.print(result);
		
	}

	public void practice4() {
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + num2 / num1);
		System.out.println("���� ���� ���� : " + num2 % num1);
		
	}
	
	public void practice5() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int cl = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double grades = sc.nextDouble();
		
		String result = (gender == 'M') ? "���л�" : "���л�";
		
		System.out.println(grade+ "�г� " + cl + "�� " + number +"�� " + name +" "+ result + "�� ������ " + grades + "�̴�"  );
		
	}
	
	
	 public void practice6(){
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num <= 13) ? "���" : ((num <= 19) ? "û�ҳ�" : "����"); 
		
		System.out.print(result);
	 }
	
	 public void practice7(){
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		
		System.out.print("���� : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double aver = sum / 3.0;
		
		String result = (num1 >= 40 && num2 >= 40 && num3 >= 40 && aver >= 60) ? "�հ�" : "���հ�";
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + aver);
		System.out.println(result);
		
	 }
	 
	 public void practice8(){ 
		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
        String str = sc.nextLine();
		
		char pId = str.charAt(7);
		
		String gender = (pId == '1' || pId == '3') ? "���� " : 
						(pId == '2' || pId == '4') ? "����" : "�߸� �Է��ϼ̽��ϴ�";
		System.out.println(gender); 
		 
	 }

	 public void practice9(){

		 Scanner sc = new Scanner(System.in);
			int num1;
			int num2;
			int input;

			System.out.print("����1 : ");
			num1 = sc.nextInt();

			System.out.print("����2 : ");
			num2 = sc.nextInt();

			System.out.print("�Է� : ");
			input = sc.nextInt();
			
			System.out.println((input <= num1) || (input > num2));
	 }

	 public void practice10(){
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt(); 
			 
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt(); 
		
		boolean isTrue = (num1 == num2) && (num2 == num3);
		 
		System.out.println(isTrue); 
	 }

	 
	 
	
}
