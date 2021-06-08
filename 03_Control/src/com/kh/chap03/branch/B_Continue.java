package com.kh.chap03.branch;

public class B_Continue {
	// continue : 반복문 안에서만 사용 가능 하며
	//            continue를 만나게 되면 아래의 내용을 실행하지 않고
	//            나와가장 가까운 반복문의 처음으로 (for문 > 증감식, while문 > 조건식) 돌아가라는 의미
	
	
	public void method1() {
		// 1부터 10까지 홀수 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0)
				continue;  // 짝수의 경우 아래 출력문 실행하지 않고 반복문의 처음(증감식)으로 돌아감
				System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1부터 100까지의 정수들의 합 출력
		// 단, 4의 배수는 합에서 제외
		int sum = 0;
		for(int i =1; i <=100; i++) {
			
			if(i % 4 == 0)
				continue;
			sum += i;
		}
		System.out.println("4의 배수를 제외한 1~100까지의 합 : " + sum);
	}
	
	public void method3() {
		// 2~9단까지의 구구단 출력 중
		// 4의 배수 단은 제외하고 출력하기
		for(int dan = 2; dan <= 9; dan++) {
			
			if(dan % 4 == 0)
				continue;
			
			System.out.println("===== " + dan + "단 ======");
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " x " + su + " = " + dan*su);
			}
		}
	}
	
	public void method4() {
		// 2~9단까지의 구구단 출력 중
		// 곱해지는 수가 짝수인 경우는 제외하고 출력
		// 2 x 1 = 2
		// 2 x 3 = 6
		// 2 x 5 = 10
        for(int dan = 2; dan <= 9; dan++) {
			
			System.out.println("===== " + dan + "단 ======");
			
			for(int su = 1; su <= 9; su++) {
				
				if(su % 2 == 0)
					continue;
				
				System.out.println(dan + " x " + su + " = " + dan*su);
			}
		}
	}

}
