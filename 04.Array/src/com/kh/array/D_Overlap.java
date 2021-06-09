package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	// �ߺ� ����
	public void method1() {
		// ����ڿ��� 5���� ���� �Է� �޾� �迭�� ����
		// ��, �ߺ� ���� ������� ����
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// �� �Է�
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "��° ���� �� : ");
			arr[i] = sc.nextInt();
			
			// �Է� ���� arr[i]�� ���� 0~i-1 �ε��� �ȿ� �ߺ� ���� �ִ��� Ȯ���ϴ� �ݺ���
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {   // �ߺ� ���� ���� ���
					System.out.println("�ߺ� ���� �����մϴ�.");
					i--;   // i �ε��� ���� 1�� �ٿ��� �����Ŀ��� i++ �Ǵ��� ���� �ε����� �ٽ� �� �� ���� ���� ��
					break; // �̹� �ߺ� �� �߻��� �Ǹ� �Ǿ����Ƿ� ���� �ε��� �˻簡 ���ʿ���
				}
			}
		}
		
		// �� ���
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method2() {
		// 1 ~ 10 ������ ������ �ߺ� ���� �߻����� �迭�� ���
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			// �ߺ� �� �߻� ���� �Ѻ��� �ݺ���
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i] + "��� �ߺ� �� �߻�");
					i--;
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method3() {
		//1 ~ 10 ������ ������ �߻� ���� int Ÿ���� 5��¥�� �迭�� ���
		// �� �ߺ� �� ���� ���� �߻� ��ų ��. ������������ ���� �� ���·� ���� ��.
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
	
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		// �������� (���� ���ķ� ����)
		for(int i = 1; i < arr.length; i++) {   
			for(int j = 0; j < i; j++) {  
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	   }
		System.out.println(Arrays.toString(arr));
	}
}
