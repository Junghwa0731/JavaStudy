package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// 논리 연산자
	// 두 개의 논리 값을 연산하는 연산자
	// &&(and), ||(or)
	
	public void method1() {
		// 사용자가 입력한 정수 값이 1부터 100 사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		boolean isTrue;
		// isTrue = (1 <= num <= 100)  이건 조건이 두개라 이렇게 사용 불가능 > 논리연산자 이용
		isTrue = (num >= 1) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1부터 100 사이입니까 : " + isTrue);
		// && : 두개의 조건이 모두 true 여야 && 연산의 결과값이 true
		//      하나라도 조건이 false가 된다면 && 연산의 결과 값은 false
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자 값이 영어 대문자인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		// 문자 하나 입력 받기
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' ~ 'Z' 에 해당하는 유니코드 값은 65 ~ 90
		// boolean isTrue = (ch >= 65) && (ch <= 90);  아래랑 둘다 사용가능
		boolean isTrue = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까 : " + isTrue);
		
	}
	
	public void method3() {
		// 사용자에게 프로그램 종료 여부 묻기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 하시려면 y 또는 Y를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isTrue = (ch == 'y') || (ch == 'Y');
	
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까 : " + isTrue);
		// || : 두개의 조건 중 하나라도 true 가 있다면 || 연산의 결과값은 true 
		//      두개의 조건 모두 false일 경우 || 연산의 결과 값은 false
	}
	
	public void method4() {
		int num = 10;
		System.out.println("&& 연산 전의 num 값 : " + num);
		
		boolean result1 = false && ++num > 0;  // ++num > 0 밑 노란줄의 의미는 경고 
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num 값 : " + num);
		// && 연산자 앞에 이미 f 가 있으므로 뒤의 조건을 수행하지 않아도 전체 결과 f 로 판별가능
		// 따라서 ++num 의 연산은 수행되지 않는다  > Dead code라는 경고창 확인 가능
		
		System.out.println();
		
		boolean result2 = true || ++num < 0;
		System.out.println("result2 : " + result2);
		System.out.println("|| 연산 후의 num 값 : " + num);
		// || 연산자 앞에 이미 true가 있으므로 뒤의 조건을 수행하지 않아도 전체 결과 t 로 판별가능
		// 따라서 ++num 의 연산은 수행되지 않는다  >  Dead code라는 경고창 확인 가능
		
		
	}
	
	
	
	
	
}
