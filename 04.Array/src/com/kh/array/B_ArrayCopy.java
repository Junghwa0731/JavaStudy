package com.kh.array;

import java.util.Arrays;

 // ------------< 5/20목요일차 강의 >-----------------------

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만을 복사
	// 깊은 복사 : 동일한 배열을 하나 생성해서 실제 내부 값들을 복사
	
	public void method1() {   // 얕은 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin;
		
		// 원본 출력
		System.out.println("원본 배열 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 복사본 출력
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// 복사 된 copy 배열의 2번 인덱스 값을 99로 변경
		copy[2] = 99;
		
		System.out.println("===== 복사본 배열 값 변경 후 =====");
		
		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// copy 배열의 인덱스 값을 변경했지만 원본 배열의 값도 변경 됨
		// > 같은 배열을 참조하고 있기 때문 (같은 주소 값)
		// > 배열 복사 시 copy라는 배열에 origin의 주소 값을 넣어줌 (얕은 복사)
		System.out.println("origin의 hashCode : " + origin.hashCode());
		System.out.println("copy의 hashCode : " + copy.hashCode());
	}
	
	// 복사 된 새로운 배열을 만들기 위해서는 깊은 복사가 필요
	public void method2() {
		// 1. for문 방법 : 새로운 배열 생성 후 반복문을 통해 실제 값을 넣는 방법
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];   // > 크기 5이 빈 배열 생성 지금은 0으로 초기화
		
		// 반복문을 통해 origin > copy 값 대입
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// 복사 된 copy 배열의 2번 인덱스 값을 99로 변경
		copy[2] = 99;

		System.out.println("===== 복사본 배열 값 변경 후 =====");

		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// 복사본 배열의 값만 변경 되어 있으며 다른 hashCode 값을 가짐
		// 복사본 배열을 heap 영역에 새로운 공간으로 할당함 > 깊은 복사
		System.out.println("origin의 hashCode : " + origin.hashCode());
		System.out.println("copy의 hashCode : " + copy.hashCode());
		
	}
	
	public void method3() {
		// 2. System 클래스의 arracopy()
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10];  
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// (원본 배열명, 원본 배열에서복사 시작할 인덱스, 복사본 배열명, 복사본 배열에서 복사 시작할 인덱스, 복사 길이)
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin의 hashCode : " + origin.hashCode());
		System.out.println("copy의 hashCode : " + copy.hashCode());
		
	}
	
	public void method4() {
		// 3. Arrays 클래스의 copyOf{}
		int[] origin = {1, 2, 3, 4, 5};
		
		// int[] copy = Arrays.copyOf(original, newLength);
		//                             원본 배열,  복사할 길이
		int[] copy = Arrays.copyOf(origin, 3);
		// > 지정한 newLength만큼의 길이가 메모리에 할당되며
		//   원본 배열보다 newLength가 큰 경우 원본 배열 내용 모두 복사 (나머지는0)
		//   원본 배열보다 newLength가 작은 경우 newLength 크기까지만 복사
		
		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
	}
	
	public void method5() {
		// 4. clone() : 시작 인덱스 지정할 수없으며 원본 배열 그대로 복사해 새로운 배열 할당
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin의 hashCode : " + origin.hashCode());
		System.out.println("copy의 hashCode : " + copy.hashCode());

	}
	
	
	

}
