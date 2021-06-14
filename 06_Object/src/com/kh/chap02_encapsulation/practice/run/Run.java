package com.kh.chap02_encapsulation.practice.run;

import com.kh.chap02_encapsulation.practice.Account;

public class Run {

	public static void main(String[] args) {
		Account a = new Account();
		
		a.setName("서정화");
		a.setId("810101-01-0123456");
		a.setPass("1234");
		a.setMoney(100);
		
		System.out.println("예금주 : " + a.getName());
		System.out.println("계좌 번호 : " + a.getId());
		System.out.println("비밀 번호 : " + a.getPass());
		System.out.println("잔액 : " + a.getMoney());
		
		// 잔액 정정
		a.setMoney(50);
		
		System.out.println(a.information());

	}

}
