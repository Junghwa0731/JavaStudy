package com.kh.chap03.branch;

public class B_Continue {
	// continue : �ݺ��� �ȿ����� ��� ���� �ϸ�
	//            continue�� ������ �Ǹ� �Ʒ��� ������ �������� �ʰ�
	//            ���Ͱ��� ����� �ݺ����� ó������ (for�� > ������, while�� > ���ǽ�) ���ư���� �ǹ�
	
	
	public void method1() {
		// 1���� 10���� Ȧ�� ���
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0)
				continue;  // ¦���� ��� �Ʒ� ��¹� �������� �ʰ� �ݺ����� ó��(������)���� ���ư�
				System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1���� 100������ �������� �� ���
		// ��, 4�� ����� �տ��� ����
		int sum = 0;
		for(int i =1; i <=100; i++) {
			
			if(i % 4 == 0)
				continue;
			sum += i;
		}
		System.out.println("4�� ����� ������ 1~100������ �� : " + sum);
	}
	
	public void method3() {
		// 2~9�ܱ����� ������ ��� ��
		// 4�� ��� ���� �����ϰ� ����ϱ�
		for(int dan = 2; dan <= 9; dan++) {
			
			if(dan % 4 == 0)
				continue;
			
			System.out.println("===== " + dan + "�� ======");
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " x " + su + " = " + dan*su);
			}
		}
	}
	
	public void method4() {
		// 2~9�ܱ����� ������ ��� ��
		// �������� ���� ¦���� ���� �����ϰ� ���
		// 2 x 1 = 2
		// 2 x 3 = 6
		// 2 x 5 = 10
        for(int dan = 2; dan <= 9; dan++) {
			
			System.out.println("===== " + dan + "�� ======");
			
			for(int su = 1; su <= 9; su++) {
				
				if(su % 2 == 0)
					continue;
				
				System.out.println(dan + " x " + su + " = " + dan*su);
			}
		}
	}

}
