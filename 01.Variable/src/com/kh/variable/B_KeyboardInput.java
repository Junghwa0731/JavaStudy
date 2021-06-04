package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	// java.util 패키지 하위의 Scanner 클래스를 이용한 키보드 입력 테스트
	
	public void inputScanner1() {
		// Scanner 클래스 사용을 위해 생성 > import 처리
		Scanner sc = new Scanner(System.in);
		
		// 사용자의 정보를 입력 받고 입력 받은 정보를 출력하는 프로그램
		System.out.print("당신의 이름은 무엇입니까 : ");
		// String name = sc.next();    // > 사용자가 입력한 값 중 공백 이전까지의 값만 읽어옴
		String name = sc.nextLine();   // > 사용자가 입력한 한 줄에 대한 모든 정보를 읽어옴
		
		System.out.print("당신의 나이는 몇살입니까 : ");
		int age = sc.nextInt();    // > 사용자가 입력한 정수에 대한 값 읽어오기
		
		System.out.print("당신의 키는 몇입니까(소수점 첫째 자리까지 입력) : ");
		double height = sc.nextDouble();    // > 사용자가 입력한 실수에 대한 값을 읽어오기
		
		System.out.println(name+ "님은 " + age + "세이며, 키는" + height + "cm입니다" );
	}
	
	public void inputScanner2() {
		// Scanner에서 발생할 수 있는 오류
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		/* sc.nextLine() 메소드를 제외한 다른 메소드들은 엔터를 읽어오지 않고해당 값만 읽어옴
		 *  > 버퍼에 사용자가 입력한 엔터가 남아있음
		 *  sc.nextLine() 메소드는 사용자가 입력한 한 줄에 대한 정보를 모두 읽어옴
		 *  > 엔터 값도 읽어옴
		 *  
		 *  해결 방법
		 *  sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드를 사용하게 되면
		 *  버퍼에 남아있는 엔터를 제거해줌
		 */
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		// String address = sc.next(); > 오류남
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "세이며, 사는 곳은 " 
		                + address + "이고, 키는 " + height + "cm입니다"  );
		
		
		
	}
	
	//--------- < 강의 2일차 >
	
	public void inputScanner3() {
		// 변수 선언
		String name;
		char gender;
		int age;
		double height;
		
		// 키보드를 입력하기 위해 Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 받을 때 > sc.nextLine() or sc.next()
		// 정수형 입력 받을 때 > sc.nextInt()
		// 실수형 입력 받을 때 > sc.nextDouble()
		// 그 밖에 byte, boolean 등등의 기본 자료형 입력 받을 때도 nextxxx() 마찬가지로 메소드 사용
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// gender = sc.nextChar(); > 문자 1개를 입력 받으려고 했으나 nextChar() 메소드는 존재하지 않음
		gender = sc.nextLine().charAt(0);
		// sc.nextLine() 메소드의 결과인 String 클래스 안에 있는 charAt() 이라는 메소드 기능을 한 번 더 이용
		// 문자열(String)은 여러개의 문자 (char)가 붙어있는 형태이므로 charAt()을 이용하여 char형으로 바꿔줌
		// charAt은 문자열에서 지정 된 위치에 있는 문자 하나만을 뽑아내는 기능
		// 제일 앞 문자가 0으로 시작. 1씩 증가하면서 해당 위치가 됨. ex) female(012345)
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
