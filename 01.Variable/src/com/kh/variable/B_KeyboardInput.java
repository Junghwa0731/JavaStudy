package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	// java.util ��Ű�� ������ Scanner Ŭ������ �̿��� Ű���� �Է� �׽�Ʈ
	
	public void inputScanner1() {
		// Scanner Ŭ���� ����� ���� ���� > import ó��
		Scanner sc = new Scanner(System.in);
		
		// ������� ������ �Է� �ް� �Է� ���� ������ ����ϴ� ���α׷�
		System.out.print("����� �̸��� �����Դϱ� : ");
		// String name = sc.next();    // > ����ڰ� �Է��� �� �� ���� ���������� ���� �о��
		String name = sc.nextLine();   // > ����ڰ� �Է��� �� �ٿ� ���� ��� ������ �о��
		
		System.out.print("����� ���̴� ����Դϱ� : ");
		int age = sc.nextInt();    // > ����ڰ� �Է��� ������ ���� �� �о����
		
		System.out.print("����� Ű�� ���Դϱ�(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble();    // > ����ڰ� �Է��� �Ǽ��� ���� ���� �о����
		
		System.out.println(name+ "���� " + age + "���̸�, Ű��" + height + "cm�Դϴ�" );
	}
	
	public void inputScanner2() {
		// Scanner���� �߻��� �� �ִ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		/* sc.nextLine() �޼ҵ带 ������ �ٸ� �޼ҵ���� ���͸� �о���� �ʰ��ش� ���� �о��
		 *  > ���ۿ� ����ڰ� �Է��� ���Ͱ� ��������
		 *  sc.nextLine() �޼ҵ�� ����ڰ� �Է��� �� �ٿ� ���� ������ ��� �о��
		 *  > ���� ���� �о��
		 *  
		 *  �ذ� ���
		 *  sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ带 ����ϰ� �Ǹ�
		 *  ���ۿ� �����ִ� ���͸� ��������
		 */
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		// String address = sc.next(); > ������
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age + "���̸�, ��� ���� " 
		                + address + "�̰�, Ű�� " + height + "cm�Դϴ�"  );
		
		
		
	}
	
	//--------- < ���� 2���� >
	
	public void inputScanner3() {
		// ���� ����
		String name;
		char gender;
		int age;
		double height;
		
		// Ű���带 �Է��ϱ� ���� Scanner ����
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� �Է� ���� �� > sc.nextLine() or sc.next()
		// ������ �Է� ���� �� > sc.nextInt()
		// �Ǽ��� �Է� ���� �� > sc.nextDouble()
		// �� �ۿ� byte, boolean ����� �⺻ �ڷ��� �Է� ���� ���� nextxxx() ���������� �޼ҵ� ���
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		// gender = sc.nextChar(); > ���� 1���� �Է� �������� ������ nextChar() �޼ҵ�� �������� ����
		gender = sc.nextLine().charAt(0);
		// sc.nextLine() �޼ҵ��� ����� String Ŭ���� �ȿ� �ִ� charAt() �̶�� �޼ҵ� ����� �� �� �� �̿�
		// ���ڿ�(String)�� �������� ���� (char)�� �پ��ִ� �����̹Ƿ� charAt()�� �̿��Ͽ� char������ �ٲ���
		// charAt�� ���ڿ����� ���� �� ��ġ�� �ִ� ���� �ϳ����� �̾Ƴ��� ���
		// ���� �� ���ڰ� 0���� ����. 1�� �����ϸ鼭 �ش� ��ġ�� ��. ex) female(012345)
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("Ű : ");
		height = sc.nextDouble();
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
