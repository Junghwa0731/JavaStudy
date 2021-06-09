package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	// �迭 ����
	
	public void method1() {
		// �迭�� �����ϱ⿡ �ռ� ������ ������ ���� �����غ���
		// �� ���� ���� �� ����
		int num1 = 20;
		int num2 = 10;
		
		System.out.println("==== ���� �� ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// num1�� num2�� ���� ���� �ٲ۴ٸ�?
		// num1 = num2;
		// num2 = num1;
		
		// �����ӽ÷� ������ ���ο� ������ ���� �̵�
		int temp;
		temp = num1;  // num1 ���� 20�� temp�� �̵� 
		num1 = num2;
		num2 = temp;
		
		System.out.println("==== ���� �� ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
	public void method2() {
		// �迭������ �����ϰ� �� ��ġ ���� ����
		int[] arr = {2, 1, 3};  // > �ϳ��� ���� �������� �б� : 1, 3, 2
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : "+ arr[i]);
		}
		
	}
	
	public void method3() {
		// ���� ����(insertion sort)
		// �迭�� n�� �ε��� ����0�� ~ n-1�� �ε������� ��
		int[] arr = {2, 5, 4, 1, 3};
		
		// ����ü     �񱳴��
	    // i=1�϶�     j=0~0
		// i=2�϶�     j=0~1
		// i=3�϶�     j=0~2
		// i=4�϶�     j=0~3
		
		// i=1���͸��������� �ݺ��Ҷ� > �ܺ� for��
		// j=0���� i-1���� �ݺ�         > ���� for��
		
		// �������� ����
		for(int i = 1; i < arr.length; i++) {   // ����ü �ε��� �� ���� ������Ű�� �ݺ���
			for(int j = 0; j < i; j++) {   // ����ü �ε��� ������ ������ ó������ �ε��� -1���� ���� ���ϴ� �ݺ���
				System.out.println("���� �ε��� ��ġ : " + i + ", " + j);
				// �������� ������ ���� ��
				// �������� ������ �ε�ȣ�� �ݴ�� ó��
				if(arr[i] < arr[j]) {
					System.out.println("==== ��ȯ �߻� ====");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// ���� ����� �ٷ� Ȱ���غ��� ��¹�
				System.out.println(i + "ȸ�� : " + Arrays.toString(arr));
			}
		}
		
		System.out.println("==============");
		// ���� ��� Ȯ��
		System.out.println("���� ��� : " + Arrays.toString(arr));
	}
	
	public void method4() {
		int[] arr = {2, 5, 4, 1, 3};
		
		// Arrays.sort(arr);
		Arrays.sort(arr, 0, 3); // fromIndex, toIndex
		// > 0�� �ε������� 3�� �ε��� ������ ����
		
		System.out.println(Arrays.toString(arr));
		
	}

}
