package com.kh.first;   // 클래스가 존재하는 패키지 경로

public class A_MethodPrinter {
	
	public void methodA() {
		System.out.println("Method A가 호출 되었어요!");
		methodB();
	}
	
	public void methodB() {
		System.out.println("Method B가 호출 되었어요!");
		methodC();
	}
	
	public void methodC() {
		System.out.println("Method C가 호출 되었어요!");
	}
	
}
