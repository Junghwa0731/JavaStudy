package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// �ٸ� ��Ű���� �ִ� Ŭ���� Person�� ��üȭ�ϱ� ���� import �۾� �ʿ�
		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("�캰��");
		p.setAge(20);
		p.setGender('f');
		p.setPhone("010-1234-5678");
		p.setEmail("aaa@iei.or.kr");

		System.out.println(p.information());
		
		
	}

}
