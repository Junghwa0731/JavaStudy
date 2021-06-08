package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/* 반복문 : 프로그램 수행 흐름을 제어하는 제어문 중 하나로
	 * 실행 코드를 반복적으로 수행 시켜줌
	 * for문과 while (do-while문) 두 종류로 나뉨
	 */
	
	/* for(초기식; 조건식; 증감식) {
	 *      실행할 코드;
	 * }
	 */
	
	public void method1() {
		// "안녕하세요" 10줄 출력
		// System.out.println("안녕하세요"); 기존엔 이 문장을 10번 써야했지만 for이용하면 간단히 작성가능
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("안녕하세요");		
		}
		
	}
	
	public void method2() {
		// 1부터 5까지 출력
		for(int i = 1; i <=5; i++) {    // 증감식 ++전위/후위++ 연산 상관 없음  > 다른 연산 없음 i만 증가중이므로
			System.out.print(i + " ");  // + " " 각 숫자마다 띄어쓰기 할때 사용
		}	
	}
	public void method3() {
		// 5부터 1까지 출력
		// 증가(++) 연산자 뿐만 아니라 감소(--)연산자도 가능
		for(int i = 5; i >= 1; i--)
			System.out.print(i + " "); 
	}
	
	public void method4() {
		// 1부터 10 사이의 홀수 출력
		// 1 3 5 7 9
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		
		for(int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method5() {
		// 1부터 10까지의 정수값 합계 구하기
		// 1+2+3+...+9+10
		int sum = 0;    // 합계 누적 연산할 변수
		for(int i = 1; i <= 10; i++) {
			sum += i;  // sum = sum + i 같은말
		}
		System.out.print("합계 : " + sum);
		
	}
	
	public void method6() {
		// 1부터 사용자가 키보드로 입력한 수까지의 합계
		Scanner sc = new Scanner(System.in);		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int sum = 0;   // 합계 누적 연산할 변수
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.print("1부터 " + num + "까지의 합계 : " + sum);
		
	}
	
	public void method7() {
		// 구구단 2단 출력하기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		for(int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		
	}
	
	public void method8() {
		// 사용자에게 입력 받은 수에 해당하는 구구단 출력하기
		// 사용자가 입력한 숫자가 2~9 사이가 맞는지 확인해서 맞을 경우만 구구단 출력
		// 아닌 경우 2~9 사이의 값을 입력하야합니다 출력
		// 출력문은 printf로 작성해부기
		Scanner sc = new Scanner(System.in);		
		System.out.print("정수(2~9)사이의 값 입력: ");
		int num = sc.nextInt();
		
		if (num > 1 && num < 10) {
			for(int i = 1; i < 10; i++) {
			//System.out.println(num + " * " + i + " = " + num * i);
			System.out.printf("%d * %d = %d\n",num, i,(num * i));
			}
			
		} else {
			System.out.print("2~9 사이의 값을 입력하야합니다.");
		}
	}
	
	public void method9() {
		// 랜덤 값 발생 시키기
		// 1~10 사이의 랜덤 값발생시켜서 1~random값까지의 합계 구하기
		
		// java.lang.Math 클래스가 제공하는 random() 메소드
		// java.lang 패키지는 import 처리가 불필요
		// > 컴파일러에 의해 import java.lang.*; 구문이 생성
		
		double random = Math.random();
		System.out.println(random);
		// Math.random() > 0.0 ~ 0.99999 사이의 랜덤값 발생
		
		// 0.0 * 10 <- Math.random() * 10 < 1.0 * 10          => 원하는 랜덤값의 범위만큼 곱한다
		// 0.0 + 1 <- Math.random() * 10 + 1 < 10.0 + 1       => 원하는 시작값만큼 더한다
		// 1 <- (int)(Math.random() * 10) + 1 < 11            => 소수점 제거를 위해 int로 형변환
		
		int ran = (int)(Math.random() * 10) + 1;
		System.out.println(ran);	
		
		int sum = 0;   // 합계 누적 연산 변수
		for(int i = 1; i <= ran; i++) {
			sum += i;
		}
		System.out.println("1부터 " + ran + "까지의 합 : " + sum);
	}
	
	public void method10() {
		// 랜덤 구구단
		// 2~9 사이의 랜덤값을 random 변수에 담고 random 구구단 출력
		int random = (int)(Math.random() * 8 + 2);
		
		System.out.println("=== " + random + "단 ===");
		for(int i = 1; i <= 9; i++) {
			System.out.println(random + " x " + i + " = " + random * i);

		}
		
	}
	
	public void method11() {
		// 사용자에게 두 개의 정수 값 입력 받아
		// 작은 수부터 큰 수까지의 합계 구하기
		Scanner sc = new Scanner(System.in);		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		/*
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(num1 + "에서 " + num2 + "까지의 합계 : " + sum);
		*/
		// num1에 작은 값 num2에 큰 값이 들어가면 문제 없지만
		// num1에 큰 값 num2에 작은 값이 들어가면 반복문 조건 만족하지 않아 합계를 구할 수 없음

		int min = 0;   // 입력 된 정수 중 작은 값을 저장할 변수
		int max = 0;   // 입력 된 정수 중 큰 값을 저장할 변수
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(min + "에서 " + max + "까지의 합계 : " + sum);
		
		}
		
	//--------------------중첩 반목문--------------------
		/* 중첩 for문
		 * 
		 * for(초기식1; 조건식1; 증감식1) {
		 *      실행할 코드1;
		 *      for(초기식2; 조건식2; 증감식2) {
		 *          실행할 코드2;
		 *      }
		 *      실핼할 코드3;    
		 * }
		 */
		
		public void method12() {
			// 1부터 5까지 출력 되는 문장을 3줄 출력하기
			// 1 2 3 4 5
			// 1 2 3 4 5
			// 1 2 3 4 5
			for(int i = 1; i <= 3; i++) {    // 1~5까지 반복된걸 3번 반복
				for(int j = 1; j <= 5; j++) {   // 1~5까지 반복
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		
		public void method13() {
			// 0시 0분 ~ 23시 59분 출력
			// 시  > 0시부터 23시까지 증가   -- > 외부 for문
			// 분  > 0분부터 59분까지 증가   -- > 내부 for문
			
			for(int hour = 0; hour <= 23; hour++) {    // 시을 증가시기는 for문
				for(int min = 0; min <= 59; min++) {   // 분을 증가시기는 for문
					System.out.println(hour + "시 " + min + "분");
				}
			}
		}
		
		public void method14() {
			// 2단부터 9단까지 출력
			// 단  > 2부터 9까지 증가   --> 외부 for문
			// 수  > 1부터 9까지 증가   --> 내부 for문
			
			for(int dan = 2; dan <= 9; dan++) { 
				System.out.println();
				System.out.println("==== " + dan + "단 =====");
				for(int su = 1; su <= 9; su++) {   
					System.out.println(dan + " x " + su + " = " + dan * su);
				}
				System.out.println("=============");
			}
			
		}
		
		public void method15() {
			//  ****
		    //  ****
		    //  ****
		    //  ****
		    //  ****
			
			// 행 지정  --> 외부 for문
			// 열 지정  --> 내부 for문
			for(int i = 1; i <= 5; i++) {    
				for(int j = 1; j <= 4; j++) {   
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void method16() {
		    //  1***
		    //  *2**
		    //  **3*
		    //  ***4
			for(int i = 1; i <= 4; i++) {    
				for(int j = 1; j <= 4; j++) {  
					if(i == j)
						System.out.print(i);
					else
					    System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		
	
	
		
}
