package com.kh.first;

public class B_ValuePrinter {
	/* < ��� ��Ģ >
	 * 1. �б��� > �ҹ��ڷ� ����
	 * 2. Ŭ���� > �빮�ڷ� ����
	 * 3. �޼ҵ� > �ҹ��ڷν���
	 * 
	 * ���� ���� �ܾ ���� ���� �� �ܾ��� ���ڸ��� �빮�ڷ� > ī�� ǥ���(��Ÿ�� ǥ���)
	 * Valueprinter -> ValuePrinter
	 */ 
	
	public void printValue1() {
		// ���� ���� ������ ���� ����ϴ� ����� �ϴ� �޼ҵ�
		
		// 1. ���� ���
		System.out.println(123);    // ���� ��
		System.out.println(1.23);   // �Ǽ� ��
		
		// 2. ����(�Ѱ��ǹ���) ��� > ����ǥ(�̱� �����̼�) ���
		System.out.println('a'); 
		System.out.println('b'); 
		
		// 3. ���ڿ�(�������ǹ���) ��� > �ֵ���ǥ(���� �����̼�) ���
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ݰ����ϴ�");
		
		// 4. ���ο��� ���� ����
		
		System.out.println(1.23 - 0.12);  
		// > ��ǻ�ʹ� ������ �ۿ� ǥ���� �� �����Ƿ� �Ǽ� �� ������ �ҿ����ؼ� ������ ���� �� ����
		
		// 5. ���ڴ� ���ڿ� ���� ���� > ��ǻ�ʹ� �ٺ������� ���ڸ� ���ڷ� �޾Ƶ��̱� ����
		System.out.println('a' + 1);  // 97(a�� �����ڵ�) + 1 
		System.out.println('b' + 1);
		
		// 6. ���ڿ��� ������ �� >
		System.out.println("�ȳ��ϼ���" + 1);  // > "�ȳ��ϼ���1"
		System.out.println("�ݰ����ϴ�" + 22 + 33);  // > "�ݰ����ϴ�22" + 33  > �ݰ����ϴ�2233"
		
		
	}	
	
	
	public void printValue2() {
		// ���ڿ��� ������ '+' ����
		System.out.println(9 + 9);        // 18
		System.out.println(9 + "9");      // 99
		System.out.println(9 + 9 + "9");  // 18 +"9" >  "189"
		System.out.println("9" + 9 + 9);  // "99" + 9 > "999"
		// ���ڿ��� ��ġ������ ����� �޶���, �տ������� ������� ����
		
	}
	
	
	
	
}
