package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 1. �ʵ��
	// ���������� [���Ǿ�] �ڷ��� ������;
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// 2. �����ں� : ������ �����ϱ����� ������ �޼ҵ�
	// ���������� Ŭ������([�Ű�����]){}
	public Student() {}
	
	// 3. �޼ҵ�� : ����� �����ϴ� �κ�
	// ���������� ��ȯ�� �޼ҵ�� ([�Ű�����]) { }
	
	// 3_1. setter
	// ������(�ʵ�) ���� ��� �� �����ϴ� ����� �ϴ� �޼ҵ�
	// �� �� �޼ҵ�� �ܺ� ���� �����ϵ��� �ؾ��ϱ� ������ public ���� ������ ���
	// �� ���� �� ��ȯ ���� �ʿ� �����Ƿ� void (��ȯ �� ����)
	// �޼ҵ���� ī��ǥ����� ����Ͽ� ��� setXXX�� �ۼ�
	// ex) setName, setKor, setMath, ...
	// �Ű��������� ���ʻ� �ʵ��� �����ϰ� ���
	
	public void setName(String name) { // �̸��� �Ű������� �޾� �������ִ� �޼ҵ�
		// name = name;
		// > �Ű����� name = �Ű����� name;
		// { } ���������� �ش� �������� ������� ������ �켱 ������ ���⶧�� 
		
		// ������� name = �Ű����� name;
	    this.name = name;   // > this���� �ش� ��ü�� �ּҰ��� ��� ����
		
	}
	
	// ���� ������ �Ű������� �޾� �������ִ� �޼ҵ�
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	// ���� ������ �Ű������� �޾� �������ִ� �޼ҵ�
	public void setMath(int math) {
		this.math = math;
	}
	
	// ���� ������ �Ű������� �޾� �������ִ� �޼ҵ�
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 3_2. getter
	// �ʵ� ���� ��ȯ���ִ� ����� �ϴ� �޼ҵ�
	// �ܺο��� �����ϱ� ���� ���� ������ public ���
	// �ʵ� ���� ��ȯ���ֹǷ� �ʵ� ���� �ڷ����� ������ ��ȯ��
	// ī�� ǥ����� ����Ͽ� getXXX�� ��� ������
	// ex) getName, getKor, getMath, getEng ...
	// �ش� �޼ҵ�� ���޵Ǵ� ���� �����Ƿ� �Ű����� ����
	
	// �̸��� ��ȯ�ϴ� �޼ҵ�
	public String getName() {
		return name;
	}
	
	// ���� ������ ��ȯ�ϴ� �޼ҵ�
	public int getKor() {
		return kor;
	}

	// ���� ������ ��ȯ�ϴ� �޼ҵ�
	public int getMath() {
		return math;
	}

	// ���� ������ ��ȯ�ϴ� �޼ҵ�
	public int getEng() {
		return eng;
	}
	
	// ��� �ʵ� ���� ��ģ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String information() {
		return "�̸� : " + name + ", ��������: " + kor + ", ���� ���� : " + math + ", ���� ���� : " + eng;
	}
		
		
	
}
