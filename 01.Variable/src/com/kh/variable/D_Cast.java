package com.kh.variable;

public class D_Cast {
	/* ����ȯ�� �� ���� �տ� �ٲ� �ڷ����� ���
	 * (��ȯ�� �ڷ���)�� �Ǵ� (��ȯ�� �ڷ���)����
	 * > �տ� ���� (��ȯ���ڷ���)��  cast ������ �Ǵ� ����ȯ �����ڶ�� ��
	 * 
	 * ����ȯ���� �ΰ��� ������ ����
	 * 1. �ڵ�(������) ����ȯ
	 * 2. ����(�����) ����ȯ
	 */
	public void rule1() {
		// boolean�� ����ȯ �Ұ���. ���� true, false ���� ���� �� ����.
		boolean flag = true;
		// flag = 100;
		
		// 1. �ڵ� ����ȯ
		// ���� ������ ���� �ڷ����� ū �ڷ��� ���� ����(���� ����, ��� �� )��
		// �����Ϸ��� �ڵ����� ���� �ڷ����� ū �ڷ������� ��ȯ
		
		// int(4byte) > double(8byte)
		int i = 12;
		double d = 3.3;
		double result = /*(double*/ i + d;
		
		System.out.println("result : " + result);
		// > int ���� double ���� ���� ����� double ������ �ڵ����� ��ȯ ��
		
		// int(4byte) > long(8byte)
		int i2 = 2147483647;
		long l = 1000000000L;
		long result2 = i2 + l;
		
		System.out.println("result2 : " + result2);
		
		// float(4byte) > double(8byte)
		float f = 1.0f;  
		double d2 = f;
		System.out.println("f : " + f);    // ���� �Ѵ� 1.0 �� �����µ� f���� float 
		System.out.println("d2 : " + d2);  // d2�� double Ÿ���� ���̴�
		
		// long(8byte) > float(4byte)
		// ũ��� long���� �� ū�� �� float�� �ڵ� ����ȯ�� �����ұ�?
		// > �Ǽ��� float�� ������ long������ ǥ�� ������ ���� ������ ��Ŀ�� �ڵ� ����ȯ ����
		long l2 = 100000000L;
		float f2 = l2;
		System.out.println("f2 : " + f2); // ��� ���� f2 : 1.0E8 �̷��� �ߴµ� E8�� 1.0�� 8�� 1.0��8���� �̶󺼼��ִ� 
		
		// char(2byte) > int(4byte)
		int num = 'A'; // int�� ������ char�� ������ �� ���� > ���ڿ� �ش��ϴ� �����ڵ� ���� ���� ��
		System.out.println("num : " + num);
		
		// byte, short �� �̿��� ����
		byte b2 = 1;
		byte b3= 10;
		// byte result3 = b2 + b3 > byte�� short�� ����� ������ int������ ó��
		// ���� ����� ���� ������ �� ū int���̹Ƿ� ������ �߻� > int������ ���� ����ȯ�� �ϸ� ���� ����
		byte result3 = (byte)(b2 + b3);   // int result3 = b2 + b3; �ϸ� ������ ���� ����Ʈ�� ���ϰ� ���� �̷��� �ϸ��
		System.out.println("result3 : " + result3);
				
	}
	
	public void rule2() {
		// 2. ���� ����ȯ
		// ū ũ���� �ڷ����� ���� ũ���� �ڷ������� �ٲٴ� �� > ����ȯ ���� �Ұ�
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum; < ����� �� 10.0 + 5.89 �Ǽ������� �ڵ� ����ȯ�� �ż� ���� ������
		// ���� ����� double �̱� ������ int�� ���� iSum�� ���� �Ұ�
		
		// ��� 1. ���� ����� int������ ���� ����ȯ
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		// �Ǽ� > ������ ���� ����ȯ�� �Ҽ��� �Ʒ� �κ��� ��� ����
		
		// ���2. double�� ���� int������ ���� ����ȯ
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
	}

	public void dataLoss() {
		// ������ �ս� �׽�Ʈ
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		// ���� ����ȯ �� ������ �ս� �׽�Ʈ
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
		
		// > ����ϱ� ���� ���� ������ �ս��� �߻��ϱ� ������ ���� ����ȯ �� �����ؼ� ����ؾ� ��
		
		
	}
	
	
	
	
	
	
	
}
