package com.kh.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.object_vs_objectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		Scanner sc = new Scanner(System.in);
		
		// ���� ���� �Է��ϱ�
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1 + "��° ���� ���� �Է�");
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher );
			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher );
			} else {
				bk3 = new Book(title, author, price, publisher );
			}
			
		}
		
		// ���� ���� ���
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// ���� ���� �˻�
		System.out.print("�˻��� å ���� : ");
		String keyword = sc.nextLine();
		
		if(keyword.equals(bk1.getTitle())) {
			System.out.println(bk1.information());
		} else if(keyword.equals(bk2.getTitle())) {
			System.out.println(bk2.information());
		} else if(keyword.equals(bk3.getTitle())) {
			System.out.println(bk3.information());
		} else {
			System.out.print("�˻���� ��ġ�ϴ� ������ ������ �����ϴ�.");
		}
		

	}
	
	// �����ؾ��� ������ ������ 3���� �ƴ϶� 100�����
	// ��¹�, ���ǹ� ���� �ش� ���� ������ŭ ����ؾ� ��
	// > ��ü�� �迭�� ���� �����غ���!

}
