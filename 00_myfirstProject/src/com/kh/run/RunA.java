package com.kh.run;

import com.kh.first.A_MethodPrinter;
// > �ܺ��� Ŭ������ ����ϰ��� �� �� import ���� �ۼ�
public class RunA {

	public static void main(String[] args) {
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 �����Ϸ���?
		
		// 1. ������ �޼ҵ尡 �ִ� Ŭ������ ����
		//    Ŭ������ ������̸� = new Ŭ������();
		// com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		A_MethodPrinter a = new A_MethodPrinter();
		
		// �ٸ� ��Ű���� �����ϴ� Ŭ���� �̱� ������ �ν��� �� ���� compile error �߻�
		// > �տ� �б�Ű���� ����ϸ� �ν� ���� or import ���� �ۼ��ϸ� �ν� ����
		
		// 2. �޼ҵ� ����(ȣ��)
		//    ������̸�. ����Ҹ޼ҵ�();
		
		/*
		a.methodA();
		a.methodB();
		a.methodC();
		*/
		
		// �޼ҵ尡 ���������� ���� �� �� Ȯ���� �� ����
		// �ٸ� ������� > methodA() ȣǮ������ �Ȱ��� ��µǵ��� ����
		a.methodA();


	}

}
