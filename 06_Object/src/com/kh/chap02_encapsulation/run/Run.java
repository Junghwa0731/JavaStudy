package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	/* ĸ��ȭ
	 *  : �߻�ȭ�� ���� ���� �� �Ӽ���� ����� �ϳ��� ���� �����ϴ� ���
	 *    Ŭ������ ���� �߿��� ������ "������ ���� ����"�� ��Ģ���� �Ͽ� �ܺο��� ������ ���� ������ ����
	 *    ��� �����͸� ó���ϴ� �޼ҵ带 Ŭ���� ���ο� �ۼ��Ͽ� �����Ϳ� ���������� �����ϴ� ����� ����
	 * 
	 *  1) ���� ����(private)
	 *     �߻�ȭ�� ���� ������ �Ӽ���(��� ����)�� �ܺηκ����� ���� ������ ���� ���� private ���� ������ ���
	 * 
	 *  2) setter/getter �޼ҵ�
	 *     ���������� �����Ͽ� ���� ����ϰ� ��ȸ�ؿ��� �޼ҵ带 �߰��ؾ� ��
	 * 
	 * */
	

	public static void main(String[] args) {
		// Student Ŭ������ ���� ��ü ����
		Student st = new Student();
		/*
		st.name = "�캰��";
		st.kor = 100;
		st.math = 99;
		st.eng = 98;
		*/
		// ��ü�� �� ���� (setter ȣ��)
		st.setName("�캰��");
		st.setKor(100);
		st.setMath(90);
		st.setEng(80);
		
		// ��ü�� �� �˾ƿ��� (getter ȣ��)
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� ���� : " + st.getKor());
		System.out.println("���� ���� : " + st.getMath());
		System.out.println("���� ���� : " + st.getEng());
		
		// ���� ����
		st.setKor(50);
		
		// �� ���� �ʵ� ���� ����ϱ� ���� information ȣ��
		System.out.println(st.information());
		
		

	}

}
