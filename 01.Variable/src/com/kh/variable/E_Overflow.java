package com.kh.variable;

public class E_Overflow {
	
	public void overflow() {
		// byte 자료형 값 저장 범위 : -128 ~ 127
		
		// byte bNum = 128; > 에러, 범위를 벗어난 값임
		// Type mismatch : cannot convert from int to byte
		// : 정수형의 기본은 int, 리더럴이 정수로 들어갈 때 기본형인 int로 들어감
		// byte가 가질 수 있는 범위 내라면 알아서 줄여서 잢을 저장하지만
		// 벙위가 넘어간다면 자료 손실이 일어 날 수 있기 때문에 에러가 끔
		
		byte bNum = 127;  // byte 최대값으로 초기화
		System.out.println("bNum: " + bNum);
		
		bNum = (byte)(bNum + 1);
		System.out.println("bNum: " + bNum);
		
	}
	
	public void cale() {
		int num1 = 1000000;
		int num2 = 700000;
		
		int multi = num1 * num2;
		System.out.println("계산 결과 : " + multi);	
		// 70000000000이 나와야 하지만 오버플러우 때문에 결과 값이 음수 (계산 결과 : -79669248) 로 발생
		
		// 값의 범위를 미리 알고 이를 예상하여 더 큰 자료형으로 변경해주면 해결 가능
		long multi2 = (long)num1 * num2;  // long multi2 = num1 * num2; long으로 	변경 해줬음에도 '계산 결과 : -79669248' 나오는 이유 
		                                  // > num1 * num2 에서 이미 오버플로우가 발생됨. multi2에 넣어봤자 이미 발생되서 값이 정상적으로 안나옴
		                                  // 그래서 발생된 후 반드시 곱하기 연산이 일어나기 전에 형변환 해주어야 함
		System.out.println("계산 결과 : " + multi2);
	
		
	}
	
	

}
