package com.kh.practice2.model.vo;

public class Circle {
	
	public static final double PI = 3.14;
	private static int radius = 5;
	
	public Circle() {}
	
	public void incrementRadius() { // 반지름 1 증가 메소드
		radius++;
	}
	public void getAreaOfCircle() { // 원의 둘레 구하는 메소드
		System.out.println("원의 둘레 : " + (2 * PI * radius));
	}
	public void getSizeOfCircle() { // 원의 넓이 구하는 메소드
		System.out.println("원의 넓이 : " + (radius * radius * PI));
	}

}
