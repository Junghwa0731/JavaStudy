package com.kh.practice2.model.vo;

public class Circle {
	
	public static final double PI = 3.14;
	private static int radius = 5;
	
	public Circle() {}
	
	public void incrementRadius() { // ������ 1 ���� �޼ҵ�
		radius++;
	}
	public void getAreaOfCircle() { // ���� �ѷ� ���ϴ� �޼ҵ�
		System.out.println("���� �ѷ� : " + (2 * PI * radius));
	}
	public void getSizeOfCircle() { // ���� ���� ���ϴ� �޼ҵ�
		System.out.println("���� ���� : " + (radius * radius * PI));
	}

}
