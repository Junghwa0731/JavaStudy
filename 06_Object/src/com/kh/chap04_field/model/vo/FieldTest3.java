package com.kh.chap04_field.model.vo;

public class FieldTest3 {
	// 전역 변수의 일종인 클래스 변수는 static 예약어가 붙은 변수
	// static 예약어가 붙으면프로그램 실행 시 static 메모리 영역에 할당 됨
	public static String pubSta = "public static";
	private static String priSta = "private static";
	// static 변수는 FieldTest3이라는 클래스(틀)로 찍어낸 모든 객체들이
	// "공유"하는 자원으로객체 생성 이전에 프로그램 실행 시 static 메모리 영역에 할당
	
	// private를 위한 getter/setter 메소드
	/*
	public String getPriSta() {
		return priSta;
	}
	public void setPriSta(String priSta) {
		this.priSta = priSta;
	}
	*/
	
	// static은 객체 생성을 하지 않고 프로그램 실행과 동시에 static 영역에 할당 되므로
	// this(객체의 주소값)을 통해 참조하지않음
	
	public static String getPriSta() {
		return priSta;
	}
	public static void setPriSta(String priSta) {
		FieldTest3.priSta = priSta;
	}

}
