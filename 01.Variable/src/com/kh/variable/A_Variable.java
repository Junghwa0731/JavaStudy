package com.kh.variable;

public class A_Variable {
	
	public void declareVariable() {
		// ���� ���� > �޸𸮿� ������ �Ҵ���
		// ���� : �ڷ��� ������;
		// �������� �׻� �ҹ��ڷ� �����ϰ� ���� �ܾ�� �Ǿ� �ִ� ��� ù ���ڴ� �빮�ڷ� �Ѵ� > ī�� ǥ���

		// �޼ҵ� �ȿ� ���� �� ������ '��������'�̹Ƿ� �ش� �޼ҵ� ������ ��� ����

		// 1. ����
		boolean isTrue; // 1byte

		// 2. ������
		// 2_1. ������
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte > ������ �� ���� ��ǥ���� �ڷ���(�⺻��)
		long lNum; // 8byte
		// 2_2. �Ǽ���
		float fNum; // 4byte
		double dNum; // 8byte > �Ǽ��� �� ���� ��ǥ���� �ڷ���(�⺻��)

		// 3. ����
		char ch; // 2byte

		// 4. ���ڿ�(������) > �⺻ �ڷ����� �ƴ� ���� �ڷ���
		String str;

		// ** ������ �� ����
		// ���� : ������ = ��;
		isTrue = true;
		isTrue = false; // ���� �������� true, false ���� ���� ����
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // l �Ǵ� L�� ���̸鼭 long �ڷ��� ���̶�� ���� ǥ��
					// �����ص� ������ ���� �ʴ� ������ �ڵ� ����ȯ ����
		fNum = 4.0F; // �ݵ�� f �Ǵ� F�� �ٿ��� �� > ������ �ս��� �Ͼ �� �־� ��Ȯ�ϰ� ���
		dNum = 8.0/* d */;// double�� �Ǽ� ���� �״�� �Է��ص� �� >> �⺻���̹Ƿ�

		// ch = 'ABC'; // ���ڿ��� �� ���ڸ� �� ���� ����
		ch = 'A'; // ����ǥ�� �̿��Ͽ� �� ����

		str = "ABC"; // �ֵ���ǥ�� �̿��Ͽ� �� ����
		str = "A";

		// ** ���� ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		
	}
	
	
	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ (�� ����)
		// ���� : �ڷ��� ������ = ��;

		// ���� �̸��� �ߺ�x
		// ���� �ٸ� �޼ҵ� �����̹Ƿ� ���� �̸��� '��������'���� ����

		// 1. ����
		boolean isTrue = false;

		// 2_1. ������
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;

		// 2_2. �Ǽ���
		float fNum = 4.0f;
		double dNum = 8.0;

		// 3. ������
		char ch = '��';

		// 4. ���ڿ� (������ ����)
		String str = "L������";

		// ** ���� ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
	}
	
	public void nameVariable() {
		// ���� ��� ��Ģ Ȯ��
		int number;
		// int number; // > �������� ������ ���� �߻�
		int Number;    // > ��ҹ��� ���еǹǷ� ����
		
		// int true;   // > ����� ��� �Ұ�
		// int void;
		
		int age1;
		// int 1age;   // > ���ڷ� ���� �Ұ�
		
		int number_1;
		int number$2;
		// int number#3;  // _ , $ �̿��� Ư������ ��� �Ұ�
		
		// ���� �ܾ�� �� �������� ��� �ٿ����� �� ��° �ܾ���� ù ���ڸ� �빮�ڷ� �ۼ� > ī�� ǥ���
		String username;  // ���ʻ� Ʋ��
		String userName;  // ���ʻ� ǥ��
		
		// �ѱ� ������ ���������� �ѱ� ������� �ʴ� ȯ�濡�� ���� �߻� ���ɼ��� �����Ƿ� ����
		String �̸�;
		
	}
	
	
	

}
