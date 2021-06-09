package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/* 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 *       저장 된 값마다 인덱스가 지정 되며 인덱스는 0부터 시작함
	 *       
	 */
	
	public void method1() {
		// 배열을 사용하지 않는 경우
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		// 이렇게 계속해서 수백개의 변수가 있다면?
		// 위의 변수들을 모두 출력하기 위해서는 각각의 출력문을 작성해야하며
		// 합계를 구하더라도 하나 하나 더해줘야함
		int sum = num1 + num2 + num3 + num4 + num5;
		
		// 위의 변수들은 같은 자료형이므로 배열을 사용하여 훨씬 간단하게 프로그래밍 할 수 있음
		/* 1. 배열 선언
		 *    자료형[] 배열명;
		 *    자료형  배열명 [];
		 */
		int[] arr;
		int arr2[];
		
		/* 2. 배열 할당
		 *    배열명 = new 자료형[배열크기];
		 */
		
		arr = new int[5];
		
		//선언과 할당을 동시에
		int[] arr1 = new int[5];
		
		/* 3. 초기화
		 *    배열명[인덱스] = 값;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		//  > 배열은 대입할 때 인데스 위치나 값이 일정한 규칙이 있다면 반복문 사용 가능
		// 0번 인덱스부터 배열의 길이 - 1 인덱스까지 반복하는 반복문
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		/* 4. 출력 */
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method2() {
		
		int i;
		// 변수 선언 > 메모리 공간에 값을 담을 박스를 만듦. 이 때 stack 영역에 할당
		
		int[] iArr;
		char cArr[];
		// 배열 선언 > 변수 선언과 동일하게 stack 영역에 공간이 생김.
		//          이 공간은 값을 담을 용도가 아니라 주소를 보관할 공간
		//          기본자료형(boolean, char, byte, short, int, long, float, double)과 같이
		//          값을 담는 변수는 그냥 변수, 그 외의 타입은 모두 주소 값을 담는 "레퍼런스" 변수
		
		// 베열 할당
		// 배열 할당 시 반드시 크기를 지정해주어야 하며 지정하지 않으면 에러 발생
		// iArr = new int[];
		iArr = new int[5];
		cArr = new char[10];
		// > new 연산자를 통해 배열을 할당하게 되면 메모리의 heap 영역에 해당 배열의 크기만큼
		//   공간이 만들어지고 그 공간의 주소 값을 stack 영역의 레퍼런스 변수에 저장
		
		System.out.println(iArr);
		System.out.println(cArr);
		// heap 영역의 메모리는 직접 접근 할 수 없고 주소를 통해서 찾아갈 수 있음
	}
	
	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// > 선언과 할당만 한 상태로 아직 초기화 진행하지 않음
		
		// 해당 배열의 각 인덱스를 출력하면 어떤 값을 가지고 있는지 확인
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		System.out.println("===============");
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/* int num;
		System.out.println(num); */
		// 배역은 지역변수와 달리 초기화 없이 출력 됨
		// > 배열을 따로 초기화 하지 않는다면 JVM이 지정한 기본 값으로 초기화
		//   heap 영역에는 값이 없는 공간이 존재할 수 없음
		
	}
	
	public void method4() {
		// 사용자에게 입력 받은 정수로 배열의 길이 지정해보기
		Scanner sc = new Scanner(System.in);
		System.out.print("할당할 배열의 길이 : ");
		int size = sc.nextInt();
		
		// double형 배열 dArr을 사용자가 입력한 size만큼 할당
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length); // .length()  < 메소드 호출이 아님 유의
		
		// 반복문 이용해서 dArr의 0번 인덱스부터 마지막 인덱스 까지 가지고 있는 값 출력
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}
	
	public void method5() {
		int[] iArr = new int[5];
		
		iArr[0] = 2;
		iArr[1] = 4;
		iArr[2] = 6;
		iArr[3] = 8;
		iArr[4] = 10;
		
		int num = 2;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = num;
			num += 2;
		}
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		// hashCode() : 주소 값의 10진수 값
		
		// iArr[5] = 12;
		// java.lang.ArrayIndexOutOfBoundsException : 5 에러 발생
		// 배열의 인덱스 값을 넘어가는 5인덱스를 요청해서 발생하는 에러
		
		// 배열은 한 번 지정한 크기를 변경할 수 없음
		// 크기를 바꾸려면 다시 배열 크기를 지정해서 할당해주어야 함
		iArr = new int[10];
		// 10이라는 크기의 배열을 heap 영역에 새로 생성하고
		// 새로 생성한 주소 값을 iArr이라는 래퍼런스 변수에 덮어씀
		
		System.out.println("==== 변경 후의 iArr ====");
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		
		// 주소 값이 변경 된 것을 알 수 있음
		// 기존에 참조하고 있던 연결이 끊기고 새로운 배열을 참조하고 있으므로
		// 이전 배열은 어느 곳에도 참조 되지 않음
		//  > 일정 시간이 지나면 가비지 컬렉터가 더 이상 쓸모 없다고 판단하여 지워줌(자동 메모리 관리)
		
		// 지금 참조하는 10개 배열을 지우기 위해서는?
		iArr = null;  // null 이건 비운다라는 값임
		// 레퍼런스 변수에 null 값이 들어가게 되면 주소값이 null로 변경
		// 참조하는 주소가 사라지며 heap의 배열과의 연결도 끊김
		// > 일정 시간이 지나면 가비지 컬렉터가 삭제
		
		System.out.println("==== 삭제 후의 iArr ====");
		System.out.println("iArr의 주소 값 : " + iArr);
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		// java.lang.NullPointerException 오류발생
		//아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을 때 발생
	}
	
	public void method6() {
		// 배열 선언 및 할당과 동시에 초기화
		int[] iArr = {1, 2, 3, 4};
		
		// 중괄호 블럭을 사용하는 경우 new 연산자를 사용하지 않아도 되며,
		// 값의 개수만큼 자동으로 크기가 할당
		
		int[] iArr2 = new int[] {1, 2, 3, 4};
		
		System.out.println("iArr의 길이 : " + iArr.length);
		System.out.println("iArr2의 길이 : " + iArr2.length);
	
		// iArr과 iArr2 안에 들어있는 값이 같으므로 비교해보자
		System.out.println(iArr == iArr2);  // < false
		// 레퍼런스 변수들의 주소값을 비교한 상황
		// 각각 heap 영역에 할당 되어 있는 다른 배열이므로 주소 값은 같을 수 없다
	}
	
	public void method7() {
		// Sting 문자열도 배열 사용 가능
		String[] sArr = new String[5];
		
		// 직접 초기화 하기 전 배열의 값 출력
		//  String은 참조자료형이므로 null로 초기화 되어 있음
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		// 0번 인덱스부터 마지막 인덱스까지 사용자의 입력 문자열 배열에 담기
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("문자열 입력 : ");
			sArr[i] = sc.nextLine();
		}
		
		// 잘 입력 되었는지 출력
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
	
	public void method8() {
		// 사용자에게 5명의 키의 정보를 입력 받아 배열에 담아두도
		// 반복문을 통해 5명의 키의 총합, 평균 구하기
		Scanner sc = new Scanner(System.in);
		double[] height= new double[5];
		
		double sum = 0.0;
		for(int i = 0; i < height.length; i++) {
			System.out.print("키 입력 : ");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / height.length);
		
	}
	
	public void method9() {
		// 사용자에게 입력 받은 크기만큼의 배열 할당 후 랜덤 값 발생시켜서 초기화 하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 해당 배열에 1부터 100 사이의 랜덤 값을 발생 시켜서 담기
		// 방법 1. java.lang.Math 클래스의 random() 메소드
		// 방법 2. java.util.Random 클래스
		Random ran = new Random();
		System.out.println("int 범위의 난수 : " + ran.nextInt());
		System.out.println("1 ~ 100 범위의 난수 : " +(ran.nextInt(100) + 1));
		
		// 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		//출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +  " ");
		}
	}
	
	public void method10() {
		// 사용자에게 문자열을 입력 받고
		// 해당 문자열의 각 문자를 char 배열에 차례로 담기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		// 입출력 동시에
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		// 5개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[5];
		
		// 각 인덱스에 사용자로부터 값 입력 받음
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		// 사용자에게 입력 받은 값의 최대값, 최소값 구하기
		
		// arr[0] 으로 최대값과 최소값을 담을 변수 초기화
		//int max = arr[0];
		//int min = arr[0];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		//  > int가 가질 수 있는 최대값 최소값으로 초기화하여 0번 인덱스부터 비교할 수도 있음
		
		// 1번 인덱스부터 배열 끝까지 비교하기(0번 인덱스 값이 비교군으로 초기화 되어 있음)
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}
	
	
	

}
 