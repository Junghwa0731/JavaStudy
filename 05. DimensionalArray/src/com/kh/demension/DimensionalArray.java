package com.kh.demension;

import java.io.InputStream;
import java.util.Scanner;

public class DimensionalArray {
	// 2차원 배열 : 1차원 배열 여러 개를 하나로 묶는 것
	
	public void method1() {
		/* 이차원 배열 선언
		 * 
		 * 자료형[][] 배열명;
		 * 자료형[] 배열명[];
		 * 자료형 배열명[][];
	     */
		
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		// 선언 시 메모리의 stack 영역에 레퍼런스 변수 생성
		
		/* 이차원 배열 할당
		 * 
		 * 배열명 = new 자료형 [행크기][열크기]
		 */
		
		arr1 = new int[3][5];
		// 할당 시 메모리의 heap 영역에 해당 크기만큼의 공간 할당
		
		System.out.println("행의 길이 : " + arr1.length);
		System.out.println("열의 길이 : " + arr1[0].length);
		
		// 이차원 배열의 인덱스에 접근하기 위해서는 이중 for문 사용
		// arr1[0][0] ~ arr1[2][4]
		for(int i = 0; i < arr1.length; i++) {   //  > 행의 갯수만큼 반복 0~2
			for(int j = 0; j < arr1[i].length; j++) {   //  > 열의 갯수만큼 반복 0~4
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method2() {
		int[][] arr = new int[3][5];
		
		// 중첩 for문을 이용하여 인덱스 순차 접근하여 값 기록
		int value = 1;
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[i].length; j++) {   
				arr[i][j] = value++; 
			}
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[i].length; j++) {   
				System.out.printf("%2d ", arr[i][j]); 
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		// 이차원 배열의 할당과 초기화 동시에
		int[][] arr = { {1, 2, 3, 4, 5},
		                {6, 7, 8, 9, 10},
		                {11, 12, 13, 14, 15} };
		
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[i].length; j++) {   
				System.out.print(arr[i][j] + "\t"); 
			}
			System.out.println();
		}
		
		
	}
	
	public void method4() {
		// 가변 배열
		// > 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은 것이 2차원 배열이므로
		// 묶여있는 1차월 배열의 길이가 꼭 같을 필요는 없음
		int[][] arr = new int[3][]; // 가변 배열 할당 (행의 크기는 3행으로)
		
		arr[0] = new int[2];   //0행은 2열로
		arr[1] = new int[1];   //1행은 1열로
		arr[2] = new int[3];   //2행은 3열로
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method5() {
		// 가변 배열의 할당과 초기화 동시
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method6() {
		// double형 2행 4열 배열을 만들어
		// 3명 학생의 국어(0행), 영어(1행) 성적을 입력 받고 마지막 열(3열)에는 합계를 담기
		double[][] arr = new double[2][4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			// 국어 or 영어 합계
			double sum = 0.0;
			
			for(int j = 0; j < arr[i].length - 1; j++) {
				if(i == 0)
					System.out.print(j + 1 + "번 학생 국어 점수 : ");
				else
					System.out.print(j + 1 + "번 학생 영어 점수 : ");

				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];
			}
			arr[i][3] = sum;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0)
				System.out.print("국어 점수 : ");
			else
				System.out.print("영어 점수 : ");
			for(int j = 0; j < arr[i].length; j++) {
				if(j < arr[i].length -1)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("합계 : " + arr[i][j]);
			}
			System.out.println();
		}
	}

	
	
	
	public void method7() {
		// char형 2차원 배열 5행 5열을 만들고 행과 열을 입력 받아
		// 해당 좌표 값을 'x' 로 변환해 2차원 배열 출력하기
		// 반복 실행하되행이나 열 입력 시 0미만 5이상의 수가 입력 되면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		char[][]arr = new char[5][5];
		
		while(true) {
			System.out.print("행 인덱스 입력 >> ");
			int row = sc.nextInt();
			System.out.print("열 인덱스 입력 >> ");
			int col = sc.nextInt();
			
			if(row < 0 || row > 4 || col < 0 || col > 4 ) 
				break;
			
			arr[row][col] = 'X';
			
			System.out.println("\t0\t1\t2\t3\t4\t");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t" );
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t" );
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
		
	}

	
	
   
}
