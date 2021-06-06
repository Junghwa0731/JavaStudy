package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자: 항목이 3개인 연산자
	// (조건식) ? (조건식이 참일 경우의 식1) : (조건식이 거짓일 경우의 식2);
	// 여기서 조건식은 t or f 둘중하나로 나오는 식
	

	public void method1() {
		// 입력 받은 정수가 양수인지 아닌지 판별 후 출력
        Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수이다" : "음수이다";
		
		System.out.print(num + "은 " + result);
		
		
	}
	
	public void method2() {
		// 사용자가 입력한 정수 값이 홀수인지 짝수인지 판별 후 출력
        Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수이다" : "홀수이다";
		
		System.out.print(num + "은 " + result);
		
	}

	public void method3() {
		// 사용자에게 두 개의 정수 값 입력 받아서
		// 두 정수 값의 곱셈 결과가 100보다 큰 경우 "결과가 100 이상입니다."
		//                         아닌 경우 "결과가 100 보다 작습니다."
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수값2 : ");
		int num2 = sc.nextInt();
		
		String result = (num1 * num2 >= 100) ? "결과가 100 이상입니다." : "결과가 100 보다 작습니다.";
		
		System.out.print(num1 * num2 + "은 " + result);
		
	}
	 
	public void method4() {
		// 삼항 연산자 중첩 사용
		// 입력 받은 정수가 0인지 0이 아닌지 판별한 후
		// 0이 아닌 경우 양수인지 음수인지 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0이다" : ((num > 0) ? "양수이다" : "음수이다");
				
		System.out.print(num  + "은 " + result);
	}
	
	public void method5() {
		// 두 수를 입력 받고
		// + 또는 -를 입력받아 알막은 계산 결과를 출력하기
		// 단 + 또는 - 외의 다른 문자를 입력하는 경우 "잘못 입력하셨브니다" 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력(+ 또는 -) : ");
		char op = sc.next().charAt(0);     // sc.nextLine() 위에 다른 메소드가 있을시 엔터값 읽어옴으로 
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "잘못 입력하셨습니다.";
		
		System.out.print("결과 : " + result);
		
		
		
		
		
		
		
	}
	
}
