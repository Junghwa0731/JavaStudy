package com.kh.operator;

public class B_InDecrease {
	
	// 증감 연산자
	// ++ : 1 증가시키는 연산자
	//      ++값 (전위 연산자), 값++ (후위 연산자)
	// -- : 1 감소시키는 연산자
	//      --값 (전위 연산자), 값-- (후위 연산자)
	
	public void method() {
		// 전위 연산
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a + ", b : " + b);
		
		// 후위 연산
		
		int c = 10;
		int d = c++;
		
		System.out.println("c : " + c + ", d : " + d);
		
		int num1 = 20;
		int result = num1++ * 3;
	
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
		
	}
	
	public void method2() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);   // a : 10(11)  여기서 출력은 10으로 됨 이유는 출력이 ++ 계산보다 먼저여서 출력은 10으로 되고, a가 가지고 있는 값은 11이 됨
		
		System.out.println((++a) + (b++));   // a : 12, b : 20(21)> 12+20 이므로 32 출력된 후 b는 21로 값을 가지게됨 
		
		System.out.println((a++) + (--b) + (--c));   // a : 12(13), b : 20, c : 29 > 61 출력
		
		System.out.println("a : " + a);  // 13
		System.out.println("b : " + b);  // 20
		System.out.println("c : " + c);  // 29
		
		
		
		
	}

}
