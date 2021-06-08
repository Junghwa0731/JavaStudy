package com.kh.chap02.loop;

import java.util.Scanner;

   //  -------<5일차 수업>

public class B_Whlie {
	/* whlie문
	 * 
	 * [초기식]
	 * whlie(조건식) {
	 *        실행할코드;
	 *        [증감식 or 분기문]
	 * 
	 * }
	 * */
	
	public void method1() {
		// "안녕하세요" 10번 출력
		
		int i = 1;  //초기식
		while(i	<= 10) {  //조건식
			System.out.println("안녕하세요");
			i++;   // 증감식
		}	
		
		// 1부터 10까지 출력
		i = 1;  //초기식   ( 위에서부터 내려오면 i는 11이 되어있으므로 1로 초기화)
		while(i	<= 10) {  //조건식
			System.out.print(i + " ");
			i++;   // 증감식
		}
	}
	
	public void method2() {
		// 10부터 1까지 역순 출력
		int i = 10;  //초기식
		while(i	>= 1) {  //조건식
			System.out.print(i + " ");
			i--;   // 증감식
		}	
		
		
	}
	
	public void method3() {
		// 1에서 10사이의 홀수만 출력
		// 1 3 5 7 9
		int i = 1;  //초기식
		while(i	<= 10) {  //조건식
			System.out.print(i + " ");
			i += 2;   // 증감식
		}	
	}
	
	public void method4() {
		// 사용자로부터 입력 받은 단의 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		int dan= sc.nextInt();
		
		// 입력 된 dan이 2~9 사이의 값인지확인
		if(dan >= 2 && dan <= 9) {
			int i = 1;  //초기식
			while(i	<= 9) {  //조건식
				System.out.print(dan + " X "+ i + " = " + dan * i);
				i++;   // 증감식		
		} 
		}	else {
			System.out.println("2~9 사이의 값을 입력해야 합니다. : ");
		}
	}
	
	public void method5() {
		// 1부터 랜덤값 (50~100)까지의 합계 구하기
		int random = (int)(Math.random() * 51) + 50;
		int sum = 0;
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.print("1부터 "+ random + "까지의 합 : " + sum);
		
	}
	
	public void method6() {
		// 사용자에게 문자열을 입력 받아 각 인덱스별 문자를 분리해서 출력
		// "apple"
		//  a
		//  p
		//  p
		//  l
		//  e
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : " + str.length());  //str.length() 해당 문자열의 길이 알려줌
		
		// str.charAt(0)
		// str.charAt(1)
		//  ...
		// str.charAt(문자열의 길이 -1)
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
	
	// ---------------------- 중첩 반복문 --------------------------------
	public void method7() {
		// 구구단 2단부터 9단까지 출력
		int dan = 2;
		while(dan <= 9) {
			int su = 1;   // 초기식 위치 중요. 반복하고 1로 리셋되어야
			while(su <= 9) {
				System.out.println(dan + " x " + su + " = "+ dan * su);
				su++;  // 증감식 위치 중요
			}
			dan++;  // 증감식 위치 중요
		 }
	}
	
	public void method8() {
		// for문의 0시 0분 ~ 23시 59분 출력을 while문 중첩으로
		// 출력은 printf로
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%2d시 %2d분\n", hour, min);
				min++;
			}
			hour++;
		}
	}
	
	// > 정해진 횟수만큰 반복하고자 할 때는 for문을 이용하는 것이 편리
	// > while문의 경우 조건에 따라서 반복할 것인지 여부를 한단하는데활용
	// ex. 메뉴를 만들어 계속해서 프로그램을 진행
	
	public void method9() {
		Scanner sc = new Scanner(System.in);	
		
		// while문의 조건에 true를 넣으면 계속해서 반복하는 무한 루프를 만들 수 있음
		while(true) {     // while(true) 무한반복 
			System.out.println();
			System.out.println("----메뉴----");
			System.out.println("1. 1부터 10까지 출력");
			System.out.println("2. 10부터 1까지 출력");
			System.out.println("3. 1부터 10까지 홀수 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				method1();
				break;
			case 2 :
				method2();
				break;
			case 3 :
				method3();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
			System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void method10() {
		// 문자열 입력 받고 그 문자열이 exit가 아닐때 까지 반복
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(!str.equals("exit")) {
			System.out.print("문자열을 입력해주세요 : ");
			str = sc.nextLine();
			System.out.println("입력 된 문자열 : " + str);
		}
		System.out.println("exit 입력으로 종료되었습니다.");
	}
	
	
	
	

}
