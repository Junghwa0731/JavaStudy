package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1(){
        Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
        String result = (num > 0) ? "양수다" : "양수가 아니다";
		
		System.out.print(result);
	}
	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0이다" : ((num > 0) ? "양수다" : "음수다");
		
		System.out.print(result);
		
	}

	public void practice3() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.print(result);
		
	}

	public void practice4() {
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + num2 / num1);
		System.out.println("남는 사탕 개수 : " + num2 % num1);
		
	}
	
	public void practice5() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cl = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double grades = sc.nextDouble();
		
		String result = (gender == 'M') ? "남학생" : "여학생";
		
		System.out.println(grade+ "학년 " + cl + "반 " + number +"번 " + name +" "+ result + "의 성적은 " + grades + "이다"  );
		
	}
	
	
	 public void practice6(){
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int num = sc.nextInt();
		
		String result = (num <= 13) ? "어린이" : ((num <= 19) ? "청소년" : "성인"); 
		
		System.out.print(result);
	 }
	
	 public void practice7(){
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double aver = sum / 3.0;
		
		String result = (num1 >= 40 && num2 >= 40 && num3 >= 40 && aver >= 60) ? "합격" : "불합격";
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + aver);
		System.out.println(result);
		
	 }
	 
	 public void practice8(){ 
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호를 입력하세요(- 포함) : ");
        String str = sc.nextLine();
		
		char pId = str.charAt(7);
		
		String gender = (pId == '1' || pId == '3') ? "남자 " : 
						(pId == '2' || pId == '4') ? "여자" : "잘못 입력하셨습니다";
		System.out.println(gender); 
		 
	 }

	 public void practice9(){

		 Scanner sc = new Scanner(System.in);
			int num1;
			int num2;
			int input;

			System.out.print("정수1 : ");
			num1 = sc.nextInt();

			System.out.print("정수2 : ");
			num2 = sc.nextInt();

			System.out.print("입력 : ");
			input = sc.nextInt();
			
			System.out.println((input <= num1) || (input > num2));
	 }

	 public void practice10(){
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt(); 
			 
		System.out.print("입력3 : ");
		int num3 = sc.nextInt(); 
		
		boolean isTrue = (num1 == num2) && (num2 == num3);
		 
		System.out.println(isTrue); 
	 }

	 
	 
	
}
