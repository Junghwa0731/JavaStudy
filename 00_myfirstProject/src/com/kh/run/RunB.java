package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {

	public static <B> void main(String[] args) {
		// �ٸ� Ŭ������ �ִ� �޼ҵ� ������ ��
		// 1. ����ϰ��� �ϴ� Ŭ���� ����
		//    Ŭ������ ������̸� = new Ŭ������();
		B_ValuePrinter b = new B_ValuePrinter();    // > import ���� ó��
		
		// 2. ����ϰ��� �ϴ� �޼ҵ� ȣ��
		//    ������̸�. ����Ҹ޼ҵ��();
		b.printValue1();
	}

}
