package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	// 중복 제거
	public void method1() {
		// 사용자에게 5개의 값을 입력 받아 배열에 저장
		// 단, 중복 값은 허용하지 않음
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// 값 입력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 정수 값 : ");
			arr[i] = sc.nextInt();
			
			// 입력 받은 arr[i]의 값이 0~i-1 인덱스 안에 중복 값이 있는지 확인하는 반복문
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {   // 중복 값이 있을 경우
					System.out.println("중복 값이 존재합니다.");
					i--;   // i 인덱스 값을 1개 줄여서 증감식에서 i++ 되더라도 동일 인덱스에 다시 한 번 값을 감게 함
					break; // 이미 중복 값 발생이 판명 되었으므로 이후 인덱스 검사가 불필요함
				}
			}
		}
		
		// 값 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method2() {
		// 1 ~ 10 사이의 난수를 중복 없이 발생시켜 배열에 담기
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			// 중복 값 발생 여부 한별할 반복문
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i] + "라는 중복 값 발생");
					i--;
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method3() {
		//1 ~ 10 사이의 난수를 발생 시켜 int 타입의 5개짜리 배열에 담기
		// 단 중복 값 없이 난수 발생 시킬 것. 내림차순으로 정렬 된 형태로 만들 것.
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
	
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 (삽입 정렬로 구현)
		for(int i = 1; i < arr.length; i++) {   
			for(int j = 0; j < i; j++) {  
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	   }
		System.out.println(Arrays.toString(arr));
	}
}
