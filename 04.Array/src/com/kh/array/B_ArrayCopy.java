package com.kh.array;

import java.util.Arrays;

 // ------------< 5/20������� ���� >-----------------------

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ��� ����
	// ���� ���� : ������ �迭�� �ϳ� �����ؼ� ���� ���� ������ ����
	
	public void method1() {   // ���� ����
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin;
		
		// ���� ���
		System.out.println("���� �迭 ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// ���� �� copy �迭�� 2�� �ε��� ���� 99�� ����
		copy[2] = 99;
		
		System.out.println("===== ���纻 �迭 �� ���� �� =====");
		
		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// copy �迭�� �ε��� ���� ���������� ���� �迭�� ���� ���� ��
		// > ���� �迭�� �����ϰ� �ֱ� ���� (���� �ּ� ��)
		// > �迭 ���� �� copy��� �迭�� origin�� �ּ� ���� �־��� (���� ����)
		System.out.println("origin�� hashCode : " + origin.hashCode());
		System.out.println("copy�� hashCode : " + copy.hashCode());
	}
	
	// ���� �� ���ο� �迭�� ����� ���ؼ��� ���� ���簡 �ʿ�
	public void method2() {
		// 1. for�� ��� : ���ο� �迭 ���� �� �ݺ����� ���� ���� ���� �ִ� ���
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];   // > ũ�� 5�� �� �迭 ���� ������ 0���� �ʱ�ȭ
		
		// �ݺ����� ���� origin > copy �� ����
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// ���� �� copy �迭�� 2�� �ε��� ���� 99�� ����
		copy[2] = 99;

		System.out.println("===== ���纻 �迭 �� ���� �� =====");

		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// ���纻 �迭�� ���� ���� �Ǿ� ������ �ٸ� hashCode ���� ����
		// ���纻 �迭�� heap ������ ���ο� �������� �Ҵ��� > ���� ����
		System.out.println("origin�� hashCode : " + origin.hashCode());
		System.out.println("copy�� hashCode : " + copy.hashCode());
		
	}
	
	public void method3() {
		// 2. System Ŭ������ arracopy()
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10];  
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// (���� �迭��, ���� �迭�������� ������ �ε���, ���纻 �迭��, ���纻 �迭���� ���� ������ �ε���, ���� ����)
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin�� hashCode : " + origin.hashCode());
		System.out.println("copy�� hashCode : " + copy.hashCode());
		
	}
	
	public void method4() {
		// 3. Arrays Ŭ������ copyOf{}
		int[] origin = {1, 2, 3, 4, 5};
		
		// int[] copy = Arrays.copyOf(original, newLength);
		//                             ���� �迭,  ������ ����
		int[] copy = Arrays.copyOf(origin, 3);
		// > ������ newLength��ŭ�� ���̰� �޸𸮿� �Ҵ�Ǹ�
		//   ���� �迭���� newLength�� ū ��� ���� �迭 ���� ��� ���� (��������0)
		//   ���� �迭���� newLength�� ���� ��� newLength ũ������� ����
		
		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
	}
	
	public void method5() {
		// 4. clone() : ���� �ε��� ������ �������� ���� �迭 �״�� ������ ���ο� �迭 �Ҵ�
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin�� hashCode : " + origin.hashCode());
		System.out.println("copy�� hashCode : " + copy.hashCode());

	}
	
	
	

}
