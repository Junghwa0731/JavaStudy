package com.kh.chap04_field.model.vo;

/* - 전역 변수 : 클래스 영역에 작성하는 변수로 같은 클래스 내에서 어디서든 사용 가능
 * - 지역 변수 : 메소드 생성 시, 생성자, 제어문 등 클래스 영역을 제외한 특정 구역 ({})
 *            안에 생성 되어 그 지역에서만 사용 가능
 *            
 *  1. 전역 변수
 *  
 *   - 멤버 변수(인스턴스 변수)
 *     생성 : new 를 통해 인스턴스(객체) 생성 시 메모리 할당
 *     소멸 : 객체 소멸 시 소멸
 *     
 *   - 클래스 변수(static 변수) : static 예약어가 붙은 변수 > 뒤에서 따로 다뤄볼 것
 *     생성 : 프로그램 실행 시 static 메모리 영역에 할당
 *     소멸 : 프로그램이 종료 될 때 소멸
 *     
 *  2. 지역 변수
 *     생성 : 특정한 구역({}) 실행 시 메모리 영역에 할당 (ex. 메소드 실행 시)
 *     소멸 : 특정한 구역({}) 종료 시 소멸 (ex. 메소드 종료 시)   
 * 
 * */

public class FieldTest2 {
	
	//멤버 변수 (인스턴스 변수) == 필드
	private int global;
	
	public void test(int num) {
		// 지역 변수 (특정 구역 > 메소드 영역 내에 적성 된 변수)
		int local = 10;
		
		// 멤버 변수 출력
		// 전역 변수는 클래스 전역에서 사용 가능
		// 초기화 하지 않았을 때는 JVM이 기본 값 부여 > 0
		System.out.println("전역 변수 : " + global);
		
		// 지역 변수 출력
		// 지역 변수는 반드시 초기화 되어야 함
		System.out.println("지역 변수 : " + local);
		
		// 매개 변수(메소드의 소괄호 안에 작성하는 변수) 출력
		// 매개변수도 지역 변수의 일종으로 영역 안에서만 사용 가능
		System.out.println("매개 변수 : " + num);
		
		// ----------------------------------------
		FieldTest1 f1 = new FieldTest1();
		System.out.println(f1.pub);
		System.out.println(f1.pro);
		System.out.println(f1.def);
		System.out.println(f1.getPri());
		// > 같은 패키지 내에서 접근해서 public, protected, 
	}
	

}
