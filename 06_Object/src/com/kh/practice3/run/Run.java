package com.kh.practice3.run;

import com.kh.practice3.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1.information());
		
		Book b2 = new Book("�ڹٹ���" , "�ڹ����ǻ�", "����ȭ");
		System.out.println(b2.information());
		
		Book b3 = new Book("�ڹٹ���2" , "�ڹ����ǻ�2", "ȫ�浿", 10000, 0.5);
		System.out.println(b3.information());

	}

}
