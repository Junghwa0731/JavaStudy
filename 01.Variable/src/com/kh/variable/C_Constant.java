package com.kh.variable;

public class C_Constant {
	
	public void final1Constant() {
		// 상수 테스트
		
		int age = 20;
		final int AGE = 20;
		
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		// 값 변경 테스트
		age = 30;
		// AGE = 30; > 오류 발생 : 상수는 한 번 지정 된 값을 변경하지 못함
		
		System.out.println("변경 된 age: " + age);
		System.out.println("변경할 수 없는 AGE : " + AGE);
		
		
	}

}
