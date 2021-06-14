package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.User;

public class Run1 {

	public static void main(String[] args) {
		// 1. �⺻ �����ڷ� ��ü ����
		User u1 = new User();
		System.out.println(u1.information());
		// JVM�� �⺻ �� ��� > [userId=null, userPwd=null, userName=null, age=0, gender= ]
		// ���� ���� �ʱ�ȭ �ϰ� ������ ������ setter �޼ҵ带 ���� ���� �־���� ����

		// 2. �Ű����� �����ڷ� ��ü ����
		// > ������ ���ÿ� �ʱ�ȭ �ϴ� ���
		User u2 = new User("user02", "pass02", "ȫ�浿");
		System.out.println(u2.information());

		// overloading�� �̿��Ͽ� ���� ���� �Ű����� �����ڸ� ���� �� ����'
		User u3 = new User("user03", "pass03", "�캰��", 20, 'F');
		System.out.println(u3.information());

	}

}
