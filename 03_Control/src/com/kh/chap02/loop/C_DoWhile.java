package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/* do while��
	 * 
	 * [�ʱ��]
	 * do {
	 *     ������ �ڵ�;
	 *     [������ or �б⹮]
	 * } while(���ǽ�);
	 * 
	 */
	
	public void method1() {
		int num = 0;
		do {
		System.out.println(num);
	    } while(num !=0);
		// while���� do while���� ��������
		// ������ ���� �ʾƵ� �ݵ�� �� ���� ���� ���� �ϰ� ���� �˻縦 �Ѵٴ���
	}
	
	public void method2() {
		// 1���� 10���� ���
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 10);
	}
	
	public void method3() {
		// 1���� ������(17~24)������ �� ���ϱ�
	    int random = (int)(Math.random() * 8) + 17; //8�� ������ 17~24���� 	
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while(i <= random);
		System.out.print("1���� "+ random + "������ �� : " + sum);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		int i = 0;
		do {
			System.out.println(str.charAt(i));
	         i++;
		} while(i < str.length());
		// �� ���忭�� �Է� ���� ��� runtime error�߻�
		//  > do while���� �ѹ� ���� �� ������ Ȯ���ϹǷ�
	}
	
	


	
	

}
