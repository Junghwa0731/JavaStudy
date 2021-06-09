package com.kh.array.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		// ���̰� 10�� �迭�� ������
		int[] arr = new int[10];
		
		
		// 0���� �迭�Ǳ���-1 ���� �ݺ� --> 0�� �ε������� ������ �ε������� �ݺ�
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i+1; 
		}
		
		//  �� ������ ���
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		//  ���̰� 10�� �迭�� ������
		int[] arr = new int[10];
		
		
		// 0���� �迭�Ǳ���-1 ���� �ݺ� --> 0�� �ε������� ������ �ε������� �ݺ�
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		//  �� ������ ���
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		// 1. ����ڿ��� ���� �Է� �ޱ�
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		// 2. �迭�� �Ҵ��� ���� ����ڰ� �Է��� ����(size)��ŭ�� ũ��� �Ҵ�
		int[] arr = new int[size];
		
		// 3. 1���� �Է¹��� ������ �迭�� �ʱ�ȭ
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 4. �� ������ ����� ���� Ȯ��
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		// 1. ���̰� 5�� String �迭 ����
		String[] arr = new String[5];
		
		// 2. �� �ε����� �� �ʱ�ȭ
		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";
		
		// ���� 1�� 2�� ������ ���ÿ� ���� �� ���� �ִ�. �Ʒ��� ����
		//String[] arr = {"���", "��", "����", "������", "����"};
		
		// 3. �迭 �ε����� Ȱ���ؼ� �� ���
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		// 1. ����ڿ��� ���ڿ��� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.println("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. ����ڰ� �Է��� ���ڿ�(str)�� ���� �ϳ��ϳ��� char�迭�� �ֱ�
		
		// ���� ����ڰ� �Է��� ���ڿ� ���̸�ŭ�� char�迭�� �Ҵ� 
		char[] arr = new char[str.length()];
		
		// �ݺ����� ���� str.charAt(i) ���� arr[i] �� ��� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		
		// 3. �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ��� �ε����� �ִ��� �ľ�
		
		int count = 0; 	// �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ������ ����
						// ���ڿ����� ������ ���ڰ� �߻��� ������ 1�� ���� �����ٲ���
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		
		// �ε������� �����ϱ� ���� �ݺ��� ���
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { // �ش� �ε��� ���� �˻��� ���ڿ� ���� ��� 
				System.out.print(i + " ");	// �ش� �ε��� �̾ ���
				count++;	// �׸��� count 1����
			}
		}
		
		// ������ print()�� ����߱� ������ ������ �� �Ǿ����� ��
		System.out.println();	// ������ ������
		System.out.println(ch + "���� : " + count);
		
	}
	
	public void practice6() {
		
		// 1. "��" ~ "��"���� �ʱ�ȭ�� ���ڿ� �迭 �����
		String[] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		// 2. ����ڿ��� 0���� 6������ ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		// 3. num���� 0 ~ 6 ������ �������� Ȯ�� --> �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�." ���
		if(num >= 0 && num <= 6) {
			
			// �ش� ���� ���
			System.out.println(arr[num] + "����");
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	
	public void practice7() {
		// 1. ����ڿ��� ���� �Է¹ް� �� ����ŭ�� �迭 ���� �� �Ҵ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. �� �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}

		// 3. ��ü �� ���� �� �� �� ���
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("�� �� : " + sum);
		
		
	}
	
	public void practice8() {
		
		// 1. ����ڿ��� 3 �̻��� ���� ���� �Է¹���
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { // 3�̻��̸鼭 Ȧ���� ��� (��, �� �Է��� ���)
				
				// ����ڰ� �Է��� ���� ũ�� ��ŭ�� �迭 ������
				int[] arr = new int[num];
				
				// ���� �ֱ� ���� ���� --> ���������� ��� 1�� ������ų ���� ���������� ��� 1�� ���ҽ�ų����
				int count = 1;
				
				// �߰����� ����
				for(int i = 0; i < arr.length/2; i++) {
					arr[i] = count++; // 1����
				}
				// �߰����� ����
				for(int i = arr.length/2; i < arr.length; i++) {
					arr[i] = count--;
				}
				
				// ���
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.println(arr[i]);
					}
				}
				break; // ����� ���� �ϰ� ���� �ݺ��� ����������
				
			}else { // 3�̻��� �ƴϰų� Ȧ���� �ƴѰ�� (��,�߸� �Է��� ���)
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		
	}
	
	public void practice9() {
		// 1. ġŲ �޴����� ����ִ� String �迭 ����, �Ҵ� ���ÿ� �ʱ�ȭ
		String[] chickens = {"�Ķ��̵�", "���", "�Ĵ�", "ġ��"};
		
		// 2. ����ڿ��� ġŲ �޴� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String menu = sc.nextLine();
		
		// 3. �ݺ����� ���� �迭�� 0�� �ε������� ������ �ε������� �����Ͽ�
		//    ����ڰ� �Է��� �޴��� ������ �޴��� �ִ��� Ȯ��
		int i = 0;
		for( ; i < chickens.length; i++) {
			if(chickens[i].equals(menu)) { // ����ڰ� �Է��� �޴��� ������ �޴��� ���
				break;       // �ݺ����� ��������
			}
		}
		
		// �ݺ����� ��� ���� �ʰ� break�� ���� ��� ����ڰ� �Է��� �޴��� ����
		if(i < chickens.length) { 
			System.out.println(menu + "ġŲ ��� ����");
		}else {
			System.out.println(menu + "ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	public void practice10() {
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ�� �� ���
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() { // �ߺ� ����
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[10];
		
		// 2. �� �ε��� ���� 1���� 10 ������ ������ �߻���Ű�µ� �̶� �ߺ��� ������
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		
		// 3. ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() { // ����
		// 1. ����ڿ��� �ֹε�Ϲ�ȣ ���ڿ� �Է¹ޱ� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();
		
		// 2. �ݺ����� �̿��Ͽ� char[]�� �Ű� ���
		char[] origin = new char[str.length()];
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		// 3. ���纻 char[]�� �����ڸ� ���ĺ��� *�� ���� ���Բ� ���� ���� �� �ٷ� ���
		char[] copy = new char[origin.length];
		
		for(int i = 0; i < copy.length; i++) {
			
			if(i <= 7) { // 7�� �ε��� ���ϱ�����
				copy[i] = origin[i]; // ������ �ֹι�ȣ�� ����
			}else { // �� ���ĺ��ʹ� *�� ������
				copy[i] = '*';
			}
			
			// �ٷ� ���
			System.out.print(copy[i]);
		}
		
		
	}
	
	public void practice13() { // �ߺ����� �� ����
		
		// 1. ũ�Ⱑ 6�� ������ �迭 ���� �� �Ҵ�
		int[] lotto = new int[6];
		
		// 2. �迭�� �ߺ������� 1���� 45������ ���� �ʱ�ȭ
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. �������� ����
		for(int i = 0; i < lotto.length -1; i++) { // �� ��ü
			for(int j = i+1; j < lotto.length; j++) { // �� ���
				if(lotto[i] > lotto[j]) { // �� ��ü�� �� ��󺸴� ū ��� ���� �ٲ���ߵ�
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		// 4. ���
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice14() { // �ߺ����� ����
		// 1. ����ڿ��� ���ڿ� �Է¹ޱ� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		// 2. �ش� ���ڿ��� ���ڵ��� char[]�� ���
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0; // ����ִ� ������ ����(�ߺ����ŵ�)
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			boolean flag = true;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // �ߺ��� �߻����� �� false�� �ٲ�
				}
			}
			
			if(flag) { // �ߺ��� �߻����� �ʾ��� ��� ����ϰԲ�
				
				if(i == 0) {
					System.out.print(arr[i]);					
				}else {
					System.out.print(", " + arr[i]);					
				}
				count++; // count �� 1����
			}
			
		}
		
		System.out.println();
		System.out.println("���� ���� : " + count);
		
		
	}
	
	public void practice15() { // ���� ����
		// 1. ����ڿ��� �迭�� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		// 2. �Է¹��� ���� ��ŭ�� ���ڿ� �迭 ���� �� �Ҵ�
		String[] arr = new String[size];
		
		// 3. �� �ε����� ���� ����ڿ��� �Է¹ޱ�
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "��° ���ڿ� : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			/*String str = sc.nextLine();
			str.toUpperCase().equals("Y");
			str.equalsIgnoreCase("Y");*/
			
			if(ch == 'y' || ch == 'Y') {
				
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length + addSize];
				
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) {	// ������ �迭�� ���� �����ϰ�
						newArr[i] = arr[i];	
					}else {		// �� �Ŀ��� �ٽ� �Է¹޵���
						System.out.print(i+1 + "��° ���ڿ� : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				arr = newArr; // ���� �迭�� ���ο� �迭�� �ּҰ� ���� --> ���� �迭 ������� ��
				
			}else {
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
	 
}
