package com.kh.chap04_field.model.vo;

public class FieldTest3 {
	// ���� ������ ������ Ŭ���� ������ static ���� ���� ����
	// static ���� ���������α׷� ���� �� static �޸� ������ �Ҵ� ��
	public static String pubSta = "public static";
	private static String priSta = "private static";
	// static ������ FieldTest3�̶�� Ŭ����(Ʋ)�� �� ��� ��ü����
	// "����"�ϴ� �ڿ����ΰ�ü ���� ������ ���α׷� ���� �� static �޸� ������ �Ҵ�
	
	// private�� ���� getter/setter �޼ҵ�
	/*
	public String getPriSta() {
		return priSta;
	}
	public void setPriSta(String priSta) {
		this.priSta = priSta;
	}
	*/
	
	// static�� ��ü ������ ���� �ʰ� ���α׷� ����� ���ÿ� static ������ �Ҵ� �ǹǷ�
	// this(��ü�� �ּҰ�)�� ���� ������������
	
	public static String getPriSta() {
		return priSta;
	}
	public static void setPriSta(String priSta) {
		FieldTest3.priSta = priSta;
	}

}
