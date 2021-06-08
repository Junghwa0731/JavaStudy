package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break  : 가장 가까운 반복문을 빠져나가는 문구
	// switch의 break는 switch문만 빠져나가는 break로
	// 반복문에서 쓰이는 break와는 다름
	
	public void method1() {
		// "exid" 입력 전까지 문자열을 계속 입력 받아 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit"))
				break;  // 무한 루프 반복문을 빠져나감
			
			System.out.println("입력 받은 문자열  : " + str);
		}
	}
	
	public void method2() {
		// 1부터 사용자가 입력한 숫자까지 합계 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		// for문 (무한루프)
		for(int i = 1; ; i++) {
			sum += i;
			if(i == num)
				break;
		}
		System.out.println("합계 : " + sum);
	}
	
	public void method3() {
		// 사용자에게 반복적으로 정수 두 개와 연산기호(문자)를 입력 받고
		// 그에 해당하는 결과 출력'
		// 또한 제시 된 연산 기호가 아닌 다른 기호 입력시 "잘못 입력하였습니다" 출력 후 반복 종료
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();
			
			System.out.print("연산 기호(+ 또는 -) : ");
			String op = sc.next();
			
			int result = 0; // 연산 결과 담을 변수
			
			if(op.equals("+")) {
				result = num1+num2;
			} else if(op.equals("-")) {
				result = num1-num2;
			} else {
				System.out.println("연산 기호를 잘못 입력하셨습니다.");
				break;
			}
			System.out.println("result : " + result);
		}
		
		
	}

}
