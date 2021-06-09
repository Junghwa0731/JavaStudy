package com.kh.array.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		// 길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i+1; 
		}
		
		//  잘 들어갔는지 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		//  길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		//  잘 들어갔는지 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		// 1. 사용자에게 정수 입력 받기
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		// 2. 배열을 할당할 껀데 사용자가 입력한 정수(size)만큼의 크기로 할당
		int[] arr = new int[size];
		
		// 3. 1부터 입력받은 값까지 배열에 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 4. 잘 들어갔는지 출력을 통해 확인
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		// 1. 길이가 5인 String 배열 선언
		String[] arr = new String[5];
		
		// 2. 각 인덱스별 값 초기화
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		// 위의 1번 2번 과정을 동시에 진행 할 수도 있다. 아래와 같이
		//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		// 3. 배열 인덱스를 활용해서 귤 출력
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기
		
		// 먼저 사용자가 입력한 문자열 길이만큼의 char배열을 할당 
		char[] arr = new char[str.length()];
		
		// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		
		// 3. 검색할 문자가 문자열에 몇개가 들어있는지와 어느 인덱스에 있는지 파악
		
		int count = 0; 	// 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
						// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가 시켜줄꺼임
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		// 인덱스마다 접근하기 위해 반복문 사용
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우 
				System.out.print(i + " ");	// 해당 인덱스 이어서 출력
				count++;	// 그리고 count 1증가
			}
		}
		
		// 위에서 print()를 사용했기 때문에 개행이 안 되어있을 것
		System.out.println();	// 개행을 해주자
		System.out.println(ch + "개수 : " + count);
		
	}
	
	public void practice6() {
		
		// 1. "월" ~ "일"까지 초기화된 문자열 배열 만들기
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 2. 사용자에게 0부터 6까지의 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 3. num값이 0 ~ 6 사이의 숫자인지 확인 --> 아닐 경우 "잘못 입력하셨습니다." 출력
		if(num >= 0 && num <= 6) {
			
			// 해당 요일 출력
			System.out.println(arr[num] + "요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	public void practice7() {
		// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}

		// 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		
	}
	
	public void practice8() {
		
		// 1. 사용자에게 3 이상의 정수 값을 입력받자
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { // 3이상이면서 홀수인 경우 (즉, 잘 입력한 경우)
				
				// 사용자가 입력한 정수 크기 만큼의 배열 만들자
				int[] arr = new int[num];
				
				// 값을 넣기 위한 변수 --> 오름차순일 경우 1씩 증가시킬 꺼고 내림차순일 경우 1씩 감소시킬꺼임
				int count = 1;
				
				// 중간까지 증가
				for(int i = 0; i < arr.length/2; i++) {
					arr[i] = count++; // 1증가
				}
				// 중간부터 감소
				for(int i = arr.length/2; i < arr.length; i++) {
					arr[i] = count--;
				}
				
				// 출력
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.println(arr[i]);
					}
				}
				break; // 제대로 실행 하고 무한 반복문 빠져나가기
				
			}else { // 3이상이 아니거나 홀수가 아닌경우 (즉,잘못 입력한 경우)
				System.out.println("다시 입력하세요.");
			}
		}
		
	}
	
	public void practice9() {
		// 1. 치킨 메뉴들이 들어있는 String 배열 선언, 할당 동시에 초기화
		String[] chickens = {"후라이드", "양념", "파닭", "치즈"};
		
		// 2. 사용자에게 치킨 메뉴 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		// 3. 반복문을 통해 배열의 0번 인덱스부터 마지막 인덱스까지 접근하여
		//    사용자가 입력한 메뉴와 동일한 메뉴가 있는지 확인
		int i = 0;
		for( ; i < chickens.length; i++) {
			if(chickens[i].equals(menu)) { // 사용자가 입력한 메뉴와 동일한 메뉴일 경우
				break;       // 반복문을 빠져나감
			}
		}
		
		// 반복문을 모두 돌지 않고 break를 만난 경우 사용자가 입력한 메뉴가 존재
		if(i < chickens.length) { 
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화한 후 출력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() { // 중복 제거
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		
		// 3. 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() { // 복사
		// 1. 사용자에게 주민등록번호 문자열 입력받기 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		// 2. 반복문을 이용하여 char[]에 옮겨 담기
		char[] origin = new char[str.length()];
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		// 3. 복사본 char[]에 성별자리 이후부터 *로 값이 들어가게끔 깊은 복사 후 바로 출력
		char[] copy = new char[origin.length];
		
		for(int i = 0; i < copy.length; i++) {
			
			if(i <= 7) { // 7번 인덱스 이하까지는
				copy[i] = origin[i]; // 기존의 주민번호들 복사
			}else { // 그 이후부터는 *값 들어가도록
				copy[i] = '*';
			}
			
			// 바로 출력
			System.out.print(copy[i]);
		}
		
		
	}
	
	public void practice13() { // 중복제거 및 정렬
		
		// 1. 크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬
		for(int i = 0; i < lotto.length -1; i++) { // 비교 주체
			for(int j = i+1; j < lotto.length; j++) { // 비교 대상
				if(lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		// 4. 출력
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice14() { // 중복제거 응용
		// 1. 사용자에게 문자열 입력받기 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0; // 들어있는 문자의 개수(중복제거된)
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			boolean flag = true;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // 중복이 발생했을 때 false로 바뀜
				}
			}
			
			if(flag) { // 중복이 발생하지 않았을 경우 출력하게끔
				
				if(i == 0) {
					System.out.print(arr[i]);					
				}else {
					System.out.print(", " + arr[i]);					
				}
				count++; // count 수 1증가
			}
			
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
		
	}
	
	public void practice15() { // 복사 응용
		// 1. 사용자에게 배열의 길이 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		// 2. 입력받은 길이 만큼의 문자열 배열 선언 및 할당
		String[] arr = new String[size];
		
		// 3. 각 인덱스별 값을 사용자에게 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			/*String str = sc.nextLine();
			str.toUpperCase().equals("Y");
			str.equalsIgnoreCase("Y");*/
			
			if(ch == 'y' || ch == 'Y') {
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length + addSize];
				
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) {	// 기존의 배열은 먼저 복사하고
						newArr[i] = arr[i];	
					}else {		// 그 후에는 다시 입력받도록
						System.out.print(i+1 + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				arr = newArr; // 기존 배열에 새로운 배열의 주소값 대입 --> 기존 배열 사라지게 됨
				
			}else {
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
	 
}
