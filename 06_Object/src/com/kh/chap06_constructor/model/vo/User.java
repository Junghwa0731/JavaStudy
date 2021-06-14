package com.kh.chap06_constructor.model.vo;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/* ������ ��� ����
	 * 
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. �Ű������� ���� ���� ���� �ʵ忡 �ʱ�ȭ �� ����
	 * 
	 * ������ ��� �� ���� ����
	 * 1. �ݵ�� Ŭ������� ���� �ؾ� ��(��/�ҹ��� ����)
	 * 2. ��ȯ���� �������� ����
	 * 3. �Ű����� ������ �ۼ� �� �⺻ �����ڴ� �ݵ�� �ۼ��ؾ� ��
	 */
	
	public User() {
		// �⺻ ������ (�Ű����� ����)
	    // ���� ��ü�� ������ �� �� ���
		// �⺻ �����ڸ� �����ϸ� �����ڰ� 0���� ��� JVM�� �ڵ����� ����� ��� ������ ��ü ���� ����
	}
	
	// �Ű����� ������
	// ��ü ������ ���ÿ� �Ű������� ���� �� ������ �ش� ����� �ʱ�ȭ �ϴ� ����
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
				
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		// ���� �����ߺ� �Ǵ� ������ �ʱ�ȭ�� �ϴ� �����ڰ� ������ ���
		// this() ������ ��� ���� > ���� Ŭ���� �������� �����ڿ��� �ٸ� ������ ȣ�� ����
		// ��, ������ ���ο��� �ٸ� ������ ȣ�� �ÿ��� �ݵ�� ù �ٿ� �ۼ��ؾ� ��
		this(userId, userPwd, userName);
		this.age = age;
		this.gender = gender;
	}
	
	/*getter / setter ����*/
	
	public String information() {
		return "[userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName 
				+ ", age=" + age + ", gender=" + gender + "]";
	}
	   
	

}
