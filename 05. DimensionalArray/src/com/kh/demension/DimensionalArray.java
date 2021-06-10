package com.kh.demension;

import java.io.InputStream;
import java.util.Scanner;

public class DimensionalArray {
	// 2���� �迭 : 1���� �迭 ���� ���� �ϳ��� ���� ��
	
	public void method1() {
		/* ������ �迭 ����
		 * 
		 * �ڷ���[][] �迭��;
		 * �ڷ���[] �迭��[];
		 * �ڷ��� �迭��[][];
	     */
		
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		// ���� �� �޸��� stack ������ ���۷��� ���� ����
		
		/* ������ �迭 �Ҵ�
		 * 
		 * �迭�� = new �ڷ��� [��ũ��][��ũ��]
		 */
		
		arr1 = new int[3][5];
		// �Ҵ� �� �޸��� heap ������ �ش� ũ�⸸ŭ�� ���� �Ҵ�
		
		System.out.println("���� ���� : " + arr1.length);
		System.out.println("���� ���� : " + arr1[0].length);
		
		// ������ �迭�� �ε����� �����ϱ� ���ؼ��� ���� for�� ���
		// arr1[0][0] ~ arr1[2][4]
		for(int i = 0; i < arr1.length; i++) {   //  > ���� ������ŭ �ݺ� 0~2
			for(int j = 0; j < arr1[i].length; j++) {   //  > ���� ������ŭ �ݺ� 0~4
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method2() {
		int[][] arr = new int[3][5];
		
		// ��ø for���� �̿��Ͽ� �ε��� ���� �����Ͽ� �� ���
		int value = 1;
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[i].length; j++) {   
				arr[i][j] = value++; 
			}
		}
		
		// ���
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[i].length; j++) {   
				System.out.printf("%2d ", arr[i][j]); 
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		// ������ �迭�� �Ҵ�� �ʱ�ȭ ���ÿ�
		int[][] arr = { {1, 2, 3, 4, 5},
		                {6, 7, 8, 9, 10},
		                {11, 12, 13, 14, 15} };
		
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[i].length; j++) {   
				System.out.print(arr[i][j] + "\t"); 
			}
			System.out.println();
		}
		
		
	}
	
	public void method4() {
		// ���� �迭
		// > ���� ���������� �� �࿡ ���� ���� ������ �������� ���� ����
		// �ڷ����� ���� 1���� �迭 �������� �ϳ��� ���� ���� 2���� �迭�̹Ƿ�
		// �����ִ� 1���� �迭�� ���̰� �� ���� �ʿ�� ����
		int[][] arr = new int[3][]; // ���� �迭 �Ҵ� (���� ũ��� 3������)
		
		arr[0] = new int[2];   //0���� 2����
		arr[1] = new int[1];   //1���� 1����
		arr[2] = new int[3];   //2���� 3����
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method5() {
		// ���� �迭�� �Ҵ�� �ʱ�ȭ ����
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method6() {
		// double�� 2�� 4�� �迭�� �����
		// 3�� �л��� ����(0��), ����(1��) ������ �Է� �ް� ������ ��(3��)���� �հ踦 ���
		double[][] arr = new double[2][4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			// ���� or ���� �հ�
			double sum = 0.0;
			
			for(int j = 0; j < arr[i].length - 1; j++) {
				if(i == 0)
					System.out.print(j + 1 + "�� �л� ���� ���� : ");
				else
					System.out.print(j + 1 + "�� �л� ���� ���� : ");

				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];
			}
			arr[i][3] = sum;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0)
				System.out.print("���� ���� : ");
			else
				System.out.print("���� ���� : ");
			for(int j = 0; j < arr[i].length; j++) {
				if(j < arr[i].length -1)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("�հ� : " + arr[i][j]);
			}
			System.out.println();
		}
	}

	
	
	
	public void method7() {
		// char�� 2���� �迭 5�� 5���� ����� ��� ���� �Է� �޾�
		// �ش� ��ǥ ���� 'x' �� ��ȯ�� 2���� �迭 ����ϱ�
		// �ݺ� �����ϵ����̳� �� �Է� �� 0�̸� 5�̻��� ���� �Է� �Ǹ� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		char[][]arr = new char[5][5];
		
		while(true) {
			System.out.print("�� �ε��� �Է� >> ");
			int row = sc.nextInt();
			System.out.print("�� �ε��� �Է� >> ");
			int col = sc.nextInt();
			
			if(row < 0 || row > 4 || col < 0 || col > 4 ) 
				break;
			
			arr[row][col] = 'X';
			
			System.out.println("\t0\t1\t2\t3\t4\t");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t" );
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t" );
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("���α׷��� �����մϴ�.");
		
	}

	
	
   
}
