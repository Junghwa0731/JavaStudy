package com.kh.variable;

public class A_Variable {
	
	public void declareVariable() {
		// 변수 선언 > 메모리에 공간을 할당함
		// 형태 : 자료형 변수명;
		// 변수명은 항상 소문자로 시작하고 여러 단어로 되어 있는 경우 첫 문자는 대문자로 한다 > 카멜 표기법

		// 메소드 안에 선언 된 변수는 '지역변수'이므로 해당 메소드 에서만 사용 가능

		// 1. 논리형
		boolean isTrue; // 1byte

		// 2. 숫자형
		// 2_1. 정수형
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte > 정수형 중 가장 대표적인 자료형(기본형)
		long lNum; // 8byte
		// 2_2. 실수형
		float fNum; // 4byte
		double dNum; // 8byte > 실수형 중 가장 대표적인 자료형(기본형)

		// 3. 문자
		char ch; // 2byte

		// 4. 문자열(참고형) > 기본 자료형이 아닌 참조 자료형
		String str;

		// ** 변수에 값 대입
		// 형태 : 변수명 = 값;
		isTrue = true;
		isTrue = false; // 논리형 변수에는 true, false 값만 저장 가능
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // l 또는 L을 붙이면서 long 자료형 값이라는 것을 표현
					// 생략해도 오류가 나지 않는 이유는 자동 형변환 떄문
		fNum = 4.0F; // 반드시 f 또는 F를 붙여야 함 > 데이터 손실이 일어날 수 있어 정확하게 명시
		dNum = 8.0/* d */;// double은 실수 값을 그대로 입력해도 됨 >> 기본형이므로

		// ch = 'ABC'; // 문자에는 한 문자만 값 저장 가능
		ch = 'A'; // 따옴표를 이용하여 값 대입

		str = "ABC"; // 쌍따옴표를 이용하여 값 대입
		str = "A";

		// ** 변수 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		
	}
	
	
	public void initVariable() {
		// 변수 선언과 동시에 초기화 (값 대입)
		// 형태 : 자료형 변수명 = 값;

		// 변수 이름은 중복x
		// 위와 다른 메소드 영역이므로 같은 이름의 '지역변수'선언 가능

		// 1. 논리형
		boolean isTrue = false;

		// 2_1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;

		// 2_2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;

		// 3. 문자형
		char ch = '가';

		// 4. 문자열 (참조형 변수)
		String str = "L오전반";

		// ** 변수 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
	}
	
	public void nameVariable() {
		// 변수 명명 규칙 확인
		int number;
		// int number; // > 변수명이 같으면 에러 발생
		int Number;    // > 대소문자 구분되므로 가능
		
		// int true;   // > 예약어 사용 불가
		// int void;
		
		int age1;
		// int 1age;   // > 숫자로 시작 불가
		
		int number_1;
		int number$2;
		// int number#3;  // _ , $ 이외의 특수문자 사용 불가
		
		// 여러 단어로 된 변수명일 경우 붙여쓰고 두 번째 단어부터 첫 글자를 대문자로 작성 > 카멜 표기법
		String username;  // 관례상 틀림
		String userName;  // 관례상 표현
		
		// 한글 변수명 가능하지만 한글 사용하지 않는 환경에서 오류 발생 가능성이 있으므로 지양
		String 이름;
		
	}
	
	
	

}
