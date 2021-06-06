package com.kh.operator;

public class C_Arithmetic {
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2);  // 나누기의 몫
		System.out.println("num1 % num2 = " + num1 % num2);  // 나누기의 나머지
		
		// %(모듈러)는 이후 조건문에서 짝홀 판별 등에 많이 사용
		// 값 % 2 가 0이면 > 짝수
		// 값 % 2 가 1이면 > 홀수
		
		// 또는 배수 판별에도 자주 사용
		// ex. 5의 배수인가 ? 값 % 5가 0인지 확인
		
	}
	
	

}
