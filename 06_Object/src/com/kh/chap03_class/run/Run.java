package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// 다른 패키지에 있는 클래스 Person을 객체화하기 위해 import 작업 필요
		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("우별림");
		p.setAge(20);
		p.setGender('f');
		p.setPhone("010-1234-5678");
		p.setEmail("aaa@iei.or.kr");

		System.out.println(p.information());
		
		
	}

}
