package com.kh.operator;

public class D_Comparison {
	
	
	// ---------< 강의 3일차 >
	
	// 비교 연산자 (관계 연산자)
	// > 두 값을 비교하는 연산자, 다른 말로 관계 연산자라고도 함
	//   비교 연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)을 반환함
	
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		boolean result1 = (a == b);
		boolean result2 = (a <= b);
		boolean result3 = (a > b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("a는 짝수인가 : " + (a % 2 == 0));   // a를 2로 나눴을때 나머지 값이 0이면 참
		System.out.println("b는 홀수인가 : " + (b % 2 == 1));   // 같다라는 표현 == 
		
		System.out.println("a는 짝수인가 : " + (a % 2 != 1));   //  != 는 띄어쓰기 하면 안됨 
		System.out.println("b는 홀수인가 : " + (b % 2 != 0));
		
				
				
		
	}

}
