package com.kh.chap02_encapsulation.practice;

public class Account {
	private String name;
	private String id;
	private String pass;
	private int money;
	
	public Account() {}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPass() {
		return pass;
	}
	public int getMoney() {
		return money;
	}
	
	public String information() {
		return "������ : " + name + ", ���� ��ȣ: " + id + ", ��� ��ȣ : " + pass + ", �ܾ� : " + money;
	}

}
