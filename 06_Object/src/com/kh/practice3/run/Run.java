package com.kh.practice3.run;

import com.kh.practice3.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1.information());
		
		Book b2 = new Book("자바배우기" , "자바출판사", "서정화");
		System.out.println(b2.information());
		
		Book b3 = new Book("자바배우기2" , "자바출판사2", "홍길동", 10000, 0.5);
		System.out.println(b3.information());

	}

}
