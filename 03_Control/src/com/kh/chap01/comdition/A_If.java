package com.kh.chap01.comdition;

import java.util.Scanner;

/* 프로그램은 기본적으로 순차적으로 진행 되지만
 * 실행 부분을 선택적으로 실행 해야 할 떄, 또는 반복적으로 실행 해야 할 때
 * "제어문"을 이용한다
 * 
 * <조건문>
 * 조건식을 통해 참인지 거짓인지를 판단해서 해당 조건이 만족하는 경우 그에 해당하는 실행문을 실행
 *  > 조건식의 결과는 true / false의 논리값이여야함
 *  > 비교연산자(대소비교, 동등비교), 논리연산자(&&, ||)를 조건식에서 사용함 
 *  
 *  조건문은 크게 if문 / switch문으로 나뉘며 if문은 크게 세가지로 나뉨
 *  1. 단독 if문
 *  2. if esle문
 *  3. if esle if esle문
 */


public class A_If {
	public void method1() {
		// 양수, 음수, 0판별
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		
		if(num < 0) {
			System.out.println("음수다");
		}
		
		if(num == 0) {
			System.out.println("0이다");
		}
	
	}
		
	public void method2() {	
		// 짝홀 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {    
			System.out.println("입력한 숫자는 짝수입니다.");
			System.out.println("테스트1");
			System.out.println("테스트2");
		}
		
		if(num % 2 == 1) 
			System.out.print("입력한 숫자는 홀수입니다.");
		
		// if 이후 실행할 실행문이 1개인 경우 {} 생략 가능
		// 실행문이 여러개인 경우가 많으므로 {} 작성하는 것이 범위 확인하기 좋음
		
	}
	
	public void method3() {
		// 성별을 입력 받아 남학생인지 여학생인지 판별
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String student = " ";
		// 지역변수는 반드시 초기화 되어야만 함
		// 초기화 하지 않고사용하면 컴파일 오류 발생
		// = "" 공백을 넣으므로써 초기화 시킴
		
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		}
		

		if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}
		
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("잘못 입력하셨습니다.");
			// 이후에 "이다" 가 출력되는데 잘 못 입력 받은 경우에는 해당 코드를 수행하고 싶지 않으므로
			// 호출 된 메소드를 종료할 때 사용하는 return 구문을 작성함
			return;
		}
		
		System.out.println(student + "이다.");
		
	}
	
	public void method4() {
		// 나이 입력 받아 어린이, 청소년 성인 판매
        Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age =sc.nextInt();
		
		String result = "";
		
		if(age <= 13) {
			result = "어린이";
		}
		
		if(age > 13 && age <= 19) {
			result = "청소년";
		}
		
		if(age > 19) {
			result = "성인";
		}
		
		System.out.println(result + "입니다.");
		
	}
	
	public void method5() {
		// 입력 된 이름이 본인이 맞는지 확인
		
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		/*if(name == "서정화") {
			System.out.print("본인입니다.");
		}
		
		if(name != "서정화") {
			System.out.print("본인이 아닙니다.");
		}
		*/
		
		// 기본 자료형은 비교시에 ==, != 를 사용하여 동등 비교를 할 수 있지만
		//  String(문자열)은 기본 자료형이 아닌 참조 자료형이므로
		//  String 클래스에서 제공하는 equals() 메소드를 사용해서 비교해야함
		
		if(name.equals("서정화")) {
			System.out.println("본인입니다.");
		}
		if(!name.equals("서정화")) {
			System.out.println("본인이 아닙니다.");
		}
		
		
	}
	
	
	

}
