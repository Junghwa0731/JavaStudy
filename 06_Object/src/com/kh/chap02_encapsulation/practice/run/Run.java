package com.kh.chap02_encapsulation.practice.run;

import com.kh.chap02_encapsulation.practice.Account;

public class Run {

	public static void main(String[] args) {
		Account a = new Account();
		
		a.setName("����ȭ");
		a.setId("810101-01-0123456");
		a.setPass("1234");
		a.setMoney(100);
		
		System.out.println("������ : " + a.getName());
		System.out.println("���� ��ȣ : " + a.getId());
		System.out.println("��� ��ȣ : " + a.getPass());
		System.out.println("�ܾ� : " + a.getMoney());
		
		// �ܾ� ����
		a.setMoney(50);
		
		System.out.println(a.information());

	}

}
