package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/* �迭 : ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	 *       ���� �� ������ �ε����� ���� �Ǹ� �ε����� 0���� ������
	 *       
	 */
	
	public void method1() {
		// �迭�� ������� �ʴ� ���
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		// �̷��� ����ؼ� ���鰳�� ������ �ִٸ�?
		// ���� �������� ��� ����ϱ� ���ؼ��� ������ ��¹��� �ۼ��ؾ��ϸ�
		// �հ踦 ���ϴ��� �ϳ� �ϳ� ���������
		int sum = num1 + num2 + num3 + num4 + num5;
		
		// ���� �������� ���� �ڷ����̹Ƿ� �迭�� ����Ͽ� �ξ� �����ϰ� ���α׷��� �� �� ����
		/* 1. �迭 ����
		 *    �ڷ���[] �迭��;
		 *    �ڷ���  �迭�� [];
		 */
		int[] arr;
		int arr2[];
		
		/* 2. �迭 �Ҵ�
		 *    �迭�� = new �ڷ���[�迭ũ��];
		 */
		
		arr = new int[5];
		
		//����� �Ҵ��� ���ÿ�
		int[] arr1 = new int[5];
		
		/* 3. �ʱ�ȭ
		 *    �迭��[�ε���] = ��;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		//  > �迭�� ������ �� �ε��� ��ġ�� ���� ������ ��Ģ�� �ִٸ� �ݺ��� ��� ����
		// 0�� �ε������� �迭�� ���� - 1 �ε������� �ݺ��ϴ� �ݺ���
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		/* 4. ��� */
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method2() {
		
		int i;
		// ���� ���� > �޸� ������ ���� ���� �ڽ��� ����. �� �� stack ������ �Ҵ�
		
		int[] iArr;
		char cArr[];
		// �迭 ���� > ���� ����� �����ϰ� stack ������ ������ ����.
		//          �� ������ ���� ���� �뵵�� �ƴ϶� �ּҸ� ������ ����
		//          �⺻�ڷ���(boolean, char, byte, short, int, long, float, double)�� ����
		//          ���� ��� ������ �׳� ����, �� ���� Ÿ���� ��� �ּ� ���� ��� "���۷���" ����
		
		// ���� �Ҵ�
		// �迭 �Ҵ� �� �ݵ�� ũ�⸦ �������־�� �ϸ� �������� ������ ���� �߻�
		// iArr = new int[];
		iArr = new int[5];
		cArr = new char[10];
		// > new �����ڸ� ���� �迭�� �Ҵ��ϰ� �Ǹ� �޸��� heap ������ �ش� �迭�� ũ�⸸ŭ
		//   ������ ��������� �� ������ �ּ� ���� stack ������ ���۷��� ������ ����
		
		System.out.println(iArr);
		System.out.println(cArr);
		// heap ������ �޸𸮴� ���� ���� �� �� ���� �ּҸ� ���ؼ� ã�ư� �� ����
	}
	
	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// > ����� �Ҵ縸 �� ���·� ���� �ʱ�ȭ �������� ����
		
		// �ش� �迭�� �� �ε����� ����ϸ� � ���� ������ �ִ��� Ȯ��
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		System.out.println("===============");
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/* int num;
		System.out.println(num); */
		// �迪�� ���������� �޸� �ʱ�ȭ ���� ��� ��
		// > �迭�� ���� �ʱ�ȭ ���� �ʴ´ٸ� JVM�� ������ �⺻ ������ �ʱ�ȭ
		//   heap �������� ���� ���� ������ ������ �� ����
		
	}
	
	public void method4() {
		// ����ڿ��� �Է� ���� ������ �迭�� ���� �����غ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ҵ��� �迭�� ���� : ");
		int size = sc.nextInt();
		
		// double�� �迭 dArr�� ����ڰ� �Է��� size��ŭ �Ҵ�
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println("dArr�� ���� : " + dArr.length); // .length()  < �޼ҵ� ȣ���� �ƴ� ����
		
		// �ݺ��� �̿��ؼ� dArr�� 0�� �ε������� ������ �ε��� ���� ������ �ִ� �� ���
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}
	
	public void method5() {
		int[] iArr = new int[5];
		
		iArr[0] = 2;
		iArr[1] = 4;
		iArr[2] = 6;
		iArr[3] = 8;
		iArr[4] = 10;
		
		int num = 2;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = num;
			num += 2;
		}
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		// hashCode() : �ּ� ���� 10���� ��
		
		// iArr[5] = 12;
		// java.lang.ArrayIndexOutOfBoundsException : 5 ���� �߻�
		// �迭�� �ε��� ���� �Ѿ�� 5�ε����� ��û�ؼ� �߻��ϴ� ����
		
		// �迭�� �� �� ������ ũ�⸦ ������ �� ����
		// ũ�⸦ �ٲٷ��� �ٽ� �迭 ũ�⸦ �����ؼ� �Ҵ����־�� ��
		iArr = new int[10];
		// 10�̶�� ũ���� �迭�� heap ������ ���� �����ϰ�
		// ���� ������ �ּ� ���� iArr�̶�� ���۷��� ������ ���
		
		System.out.println("==== ���� ���� iArr ====");
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		// �ּ� ���� ���� �� ���� �� �� ����
		// ������ �����ϰ� �ִ� ������ ����� ���ο� �迭�� �����ϰ� �����Ƿ�
		// ���� �迭�� ��� ������ ���� ���� ����
		//  > ���� �ð��� ������ ������ �÷��Ͱ� �� �̻� ���� ���ٰ� �Ǵ��Ͽ� ������(�ڵ� �޸� ����)
		
		// ���� �����ϴ� 10�� �迭�� ����� ���ؼ���?
		iArr = null;  // null �̰� ���ٶ�� ����
		// ���۷��� ������ null ���� ���� �Ǹ� �ּҰ��� null�� ����
		// �����ϴ� �ּҰ� ������� heap�� �迭���� ���ᵵ ����
		// > ���� �ð��� ������ ������ �÷��Ͱ� ����
		
		System.out.println("==== ���� ���� iArr ====");
		System.out.println("iArr�� �ּ� �� : " + iArr);
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		// java.lang.NullPointerException �����߻�
		//�ƹ��͵� �������� �ʰ� null�̶�� Ư���� ���� �����ϰ� ���� �� �߻�
	}
	
	public void method6() {
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ
		int[] iArr = {1, 2, 3, 4};
		
		// �߰�ȣ ���� ����ϴ� ��� new �����ڸ� ������� �ʾƵ� �Ǹ�,
		// ���� ������ŭ �ڵ����� ũ�Ⱑ �Ҵ�
		
		int[] iArr2 = new int[] {1, 2, 3, 4};
		
		System.out.println("iArr�� ���� : " + iArr.length);
		System.out.println("iArr2�� ���� : " + iArr2.length);
	
		// iArr�� iArr2 �ȿ� ����ִ� ���� �����Ƿ� ���غ���
		System.out.println(iArr == iArr2);  // < false
		// ���۷��� �������� �ּҰ��� ���� ��Ȳ
		// ���� heap ������ �Ҵ� �Ǿ� �ִ� �ٸ� �迭�̹Ƿ� �ּ� ���� ���� �� ����
	}
	
	public void method7() {
		// Sting ���ڿ��� �迭 ��� ����
		String[] sArr = new String[5];
		
		// ���� �ʱ�ȭ �ϱ� �� �迭�� �� ���
		//  String�� �����ڷ����̹Ƿ� null�� �ʱ�ȭ �Ǿ� ����
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		// 0�� �ε������� ������ �ε������� ������� �Է� ���ڿ� �迭�� ���
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("���ڿ� �Է� : ");
			sArr[i] = sc.nextLine();
		}
		
		// �� �Է� �Ǿ����� ���
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
	
	public void method8() {
		// ����ڿ��� 5���� Ű�� ������ �Է� �޾� �迭�� ��Ƶε�
		// �ݺ����� ���� 5���� Ű�� ����, ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		double[] height= new double[5];
		
		double sum = 0.0;
		for(int i = 0; i < height.length; i++) {
			System.out.print("Ű �Է� : ");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum / height.length);
		
	}
	
	public void method9() {
		// ����ڿ��� �Է� ���� ũ�⸸ŭ�� �迭 �Ҵ� �� ���� �� �߻����Ѽ� �ʱ�ȭ �ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// �ش� �迭�� 1���� 100 ������ ���� ���� �߻� ���Ѽ� ���
		// ��� 1. java.lang.Math Ŭ������ random() �޼ҵ�
		// ��� 2. java.util.Random Ŭ����
		Random ran = new Random();
		System.out.println("int ������ ���� : " + ran.nextInt());
		System.out.println("1 ~ 100 ������ ���� : " +(ran.nextInt(100) + 1));
		
		// �Է�
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		//���
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +  " ");
		}
	}
	
	public void method10() {
		// ����ڿ��� ���ڿ��� �Է� �ް�
		// �ش� ���ڿ��� �� ���ڸ� char �迭�� ���ʷ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		// ����� ���ÿ�
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		// 5���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[5];
		
		// �� �ε����� ����ڷκ��� �� �Է� ����
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° �Է� : ");
			arr[i] = sc.nextInt();
		}
		
		// ����ڿ��� �Է� ���� ���� �ִ밪, �ּҰ� ���ϱ�
		
		// arr[0] ���� �ִ밪�� �ּҰ��� ���� ���� �ʱ�ȭ
		//int max = arr[0];
		//int min = arr[0];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		//  > int�� ���� �� �ִ� �ִ밪 �ּҰ����� �ʱ�ȭ�Ͽ� 0�� �ε������� ���� ���� ����
		
		// 1�� �ε������� �迭 ������ ���ϱ�(0�� �ε��� ���� �񱳱����� �ʱ�ȭ �Ǿ� ����)
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		
	}
	
	
	

}
 