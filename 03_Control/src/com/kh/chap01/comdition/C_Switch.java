package com.kh.chap01.comdition;

import java.util.Scanner;

public class C_Switch {
	public void method1() {
		// 1~3 사이의 정수를 입력 받아
		// 1 > 빨간색, 2 > 파란색, 3 > 초록색 입니다 출력
		// 그 외의 입력은 잘못 입력하였습니다 출력
		Scanner sc = new Scanner(System.in);		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("빨간색입니다.");
			break;
		case 2 :
			System.out.println("파란색입니다.");
			break;	
		case 3 :
			System.out.println("초록색입니다.");
			break;	
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("과일 이름을 입력하시오: ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 3000;
			break;
		case "키위" :
			price = 4000;
			break;
		default :
			System.out.println("안 팔아요~");
			return;		
		}		
		System.out.println(fruit+ "의 가격은 " + price + "원 입니다.");
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원 등급(1/2/3)을 입력하세요: ");
		int level = sc.nextInt();
		
		if(level == 3) {
			System.out.println("매니저 등급이다.");
		} else if(level == 2) {
			System.out.println("일반 회원 등급입니다.");
		} else {
			System.out.println("새싹 회원 등급니다.");
		}	
		
		switch(level) {
		case 3 :
			System.out.println("관리 권한이 있습니다.");
		case 2 :
			System.out.println("글쓰기 권한이 있습니다.");
		case 1 :
			System.out.println("글읽기 권한이 있습니다.");
		
		}
		
		
		
		
	}
	
	
	
	
	

}
