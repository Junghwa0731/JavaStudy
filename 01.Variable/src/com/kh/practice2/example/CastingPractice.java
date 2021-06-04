package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	public void method1() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + " unicode : " + (int)ch); 
		
		// A = 65 부터 시작 , a = 97 
		// \ u 는 u65 라고 적었을떄 65는 A이기 때문에 A로 출력됨
	}
	
	public void method2() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int sum = (int)(kor + eng + mat);
		int avg = sum / 3;
		// int iAverage = (int)((num1 + num2 + num3)/3);  이건 내가 쓴 답
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		
		System.out.println( (double)iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1 / (int)fNum ); // 3
		
		System.out.println( iNum1 / fNum );// 3.3333333
		System.out.println( iNum1 / (double)fNum ); // 3.333333333333335
		
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
	    System.out.println( ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'

	
		
	}
	
	
	
	
	
}
