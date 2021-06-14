package com.kh.chap07_method.part02_methodTest.controller;

import com.kh.chap03_class.model.vo.Person;

public class NonStaticMethod {
	// �Ű����� ������ ��ȯ�� ������ ���� ����
	
	// 1 . �Ű����� ���� ��ȯ�� ���� �޼ҵ�
	public void method1() {
		// �ƹ� ���� ��ȯ���� �ʰ� �޼ҵ� ���븸 ���� �� �޼ҵ� ����
		System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ��Դϴ�.");
		
	//	return;  // ��� �޼ҵ��� ���� ���� �Ǿ� ���� (JVM�� �ڵ� ����)
	}
	
	// 2. �Ű����� ���� ��ȯ�� �ִ� �޼ҵ� 
	public String method2() {
		String str = "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ��Դϴ�.";
		return str;
	}
	
	// 3. �Ű����� �ְ� ��ȯ���� ���� �޼ҵ�
	public void method3(int num1, int num2){
		// �� �޼ҵ带 ȣ���ϴ� ������ ������ ���� ���� �ޱ� ���� �����ϴ� ���� �Ű�����
		System.out.println(num1 - num2);
	}
	
	// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		num1++;
		num2++;
		System.out.println("method4 : num1=" + num1 + ", num2="+ num2);
		
		return num1 + num2;
	}
	
	// 5. �Ű������� ��ȯ���� �迭�� ���
	public int[] method5(int[] arr) {
		arr[2] = 99;
		return arr;
	}
	
	// 6. �Ű������� ��ȯ���� ��ü�� ���
	public Person method6(Person p) {
		p.setAge(90);
		return p;
	}
	
	// 7. ���� ����
	public int method7(int ... num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	

}
