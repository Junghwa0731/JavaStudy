package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	// 배열 정렬
	
	public void method1() {
		// 배열을 정렬하기에 앞서 변수를 가지고 값을 변경해보자
		// 두 개의 변수 값 변경
		int num1 = 20;
		int num2 = 10;
		
		System.out.println("==== 변경 전 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// num1과 num2의 값을 서로 바꾼다면?
		// num1 = num2;
		// num2 = num1;
		
		// 값을임시로 보관할 새로운 변수를 만들어서 이동
		int temp;
		temp = num1;  // num1 값인 20을 temp로 이동 
		num1 = num2;
		num2 = temp;
		
		System.out.println("==== 변경 후 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
	public void method2() {
		// 배열에서도 동일하게 값 위치 변경 가능
		int[] arr = {2, 1, 3};  // > 하나씩 값을 왼쪽으로 밀기 : 1, 3, 2
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : "+ arr[i]);
		}
		
	}
	
	public void method3() {
		// 삽입 정렬(insertion sort)
		// 배열의 n번 인덱스 값을0번 ~ n-1번 인덱스까지 비교
		int[] arr = {2, 5, 4, 1, 3};
		
		// 비교주체     비교대상
	    // i=1일때     j=0~0
		// i=2일때     j=0~1
		// i=3일때     j=0~2
		// i=4일때     j=0~3
		
		// i=1부터마지막까지 반복할때 > 외부 for문
		// j=0부터 i-1까지 반복         > 내부 for문
		
		// 오름차순 정렬
		for(int i = 1; i < arr.length; i++) {   // 비교주체 인덱스 한 개씩 증가시키는 반복문
			for(int j = 0; j < i; j++) {   // 비교주체 인덱스 증가할 때마다 처음부터 인덱스 -1까지 값을 비교하는 반복문
				System.out.println("현재 인덱스 위치 : " + i + ", " + j);
				// 오름차순 정렬을 위한 비교
				// 내림차순 정렬은 부등호만 반대로 처리
				if(arr[i] < arr[j]) {
					System.out.println("==== 교환 발생 ====");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// 수행 결과물 바로 활인해보는 출력문
				System.out.println(i + "회전 : " + Arrays.toString(arr));
			}
		}
		
		System.out.println("==============");
		// 최종 결과 확인
		System.out.println("최종 결과 : " + Arrays.toString(arr));
	}
	
	public void method4() {
		int[] arr = {2, 5, 4, 1, 3};
		
		// Arrays.sort(arr);
		Arrays.sort(arr, 0, 3); // fromIndex, toIndex
		// > 0번 인덱스부터 3번 인덱스 전까지 정렬
		
		System.out.println(Arrays.toString(arr));
		
	}

}
