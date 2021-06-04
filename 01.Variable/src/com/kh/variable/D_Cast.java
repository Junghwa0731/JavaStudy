package com.kh.variable;

public class D_Cast {
	/* 형변환을 할 때는 앞에 바꿀 자료형을 명시
	 * (변환할 자료형)값 또는 (변환할 자료형)변수
	 * > 앞에 붙은 (변환할자료형)을  cast 연산자 또는 형변환 연산자라고 함
	 * 
	 * 형변환에는 두가지 종류가 있음
	 * 1. 자동(묵시적) 형변환
	 * 2. 강제(명시적) 형변환
	 */
	public void rule1() {
		// boolean은 형변환 불가능. 오직 true, false 값만 가질 수 있음.
		boolean flag = true;
		// flag = 100;
		
		// 1. 자동 형변환
		// 값의 범위가 작은 자료형과 큰 자료형 간의 연산(변수 대입, 계산 등 )시
		// 컴파일러가 자동으로 작은 자료형을 큰 자료형으로 변환
		
		// int(4byte) > double(8byte)
		int i = 12;
		double d = 3.3;
		double result = /*(double*/ i + d;
		
		System.out.println("result : " + result);
		// > int 형과 double 형의 연산 결과가 double 형으로 자동으로 변환 됨
		
		// int(4byte) > long(8byte)
		int i2 = 2147483647;
		long l = 1000000000L;
		long result2 = i2 + l;
		
		System.out.println("result2 : " + result2);
		
		// float(4byte) > double(8byte)
		float f = 1.0f;  
		double d2 = f;
		System.out.println("f : " + f);    // 값은 둘다 1.0 이 나오는데 f값은 float 
		System.out.println("d2 : " + d2);  // d2는 double 타입의 값이다
		
		// long(8byte) > float(4byte)
		// 크기는 long형이 더 큰데 왜 float로 자동 형변환이 가능할까?
		// > 실수인 float가 정수인 long형보다 표현 가능한 수의 범위가 더커서 자동 형변환 가능
		long l2 = 100000000L;
		float f2 = l2;
		System.out.println("f2 : " + f2); // 출력 값은 f2 : 1.0E8 이렇게 뜨는데 E8는 1.0의 8승 1.0의8제곱 이라볼수있다 
		
		// char(2byte) > int(4byte)
		int num = 'A'; // int형 변수에 char형 리더럴 값 대입 > 문자에 해당하는 유니코드 값이 저장 됨
		System.out.println("num : " + num);
		
		// byte, short 를 이용한 연산
		byte b2 = 1;
		byte b3= 10;
		// byte result3 = b2 + b3 > byte나 short는 연산시 무조건 int형으로 처리
		// 연산 결과가 값의 범위가 더 큰 int형이므로 에러가 발생 > int형으로 강제 형변환을 하면 저장 가능
		byte result3 = (byte)(b2 + b3);   // int result3 = b2 + b3; 하면 되지만 굳이 바이트로 정하고 싶음 이렇게 하면됨
		System.out.println("result3 : " + result3);
				
	}
	
	public void rule2() {
		// 2. 강제 형변환
		// 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것 > 형변환 생략 불가
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum; < 계산할 때 10.0 + 5.89 실수형으로 자동 형변환이 돼서 값이 구해짐
		// 연산 결과가 double 이기 때문에 int형 변수 iSum에 저장 불가
		
		// 방법 1. 수행 결과를 int형으로 강제 형변환
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		// 실수 > 정수형 강제 형변환시 소수점 아래 부분은 모두 버림
		
		// 방법2. double형 값을 int형으로 강제 형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
	}

	public void dataLoss() {
		// 데이터 손실 테스트
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		// 강제 형변환 후 데이터 손실 테스트
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
		
		// > 계산하기 쉽지 않은 데이터 손실이 발생하기 떄문에 강제 형변환 시 주의해서 사용해야 함
		
		
	}
	
	
	
	
	
	
	
}
