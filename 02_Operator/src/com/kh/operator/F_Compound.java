package com.kh.operator;

public class F_Compound {
	// 복합 대입 연산자 : 산술 연산자와 대입 연산자를 함꼐 사용하는 연산자
	// 연산 처리 속도가 훨씬 빠르므로 사용 권장함
	
	public void method() {
		int num = 12;
		
		System.out.println("num : " + num);
		
		num += 3;
		System.out.println("3 증가시킨 num : " + num);  //15
		
		num -= 5;
		System.out.println("5 감소시킨 num : " + num);  //10
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num);  //60
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);  //30
		
		num %= 4;
		System.out.println("num을 4로 나눈 나머지 : " + num);  //2
		
		
		
		
	}

}
