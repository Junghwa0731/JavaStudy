package com.kh.chap01_Abstraction.run;

import com.kh.chap01_Abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 변수 (하나의 자료형,하나의 값)만을 가지고 프로그래밍 한다면/.
		String name1 = "우별림";
		int kor1 = 100;
		int math1 = 99;
		int eng1 = 98;
		// > 수백병의 학생이 있다면 변수의 개수가 너무 늘어나 관리가 어려움
		
		// 배열(하나의자료형, 여러개의값) 을 가지고 프로그래밍 한다면?
		String[] name = {"우별림", "김영희"};
		int[] kor = {100, 70};
		int[] math = {99, 80};
		int[] eng = {98, 90};
		// > 변수만을 사용했을때보다는 효율적이지만 한 명이 전학을 가게 된다면?
		//   해당 학생의 정보를 지울 때 각각의 인덱스를 찾아 직접 지워주어야 하며 실수로 잘못 지우는 문제 상황
		
		// 따라서 클래스(틀)를 만들어 객체를 찍어내보자 !
		// 클래스(틀) 을 만들고 자바에서의 객체 형태로 만들기 위해서는 new 연산자를 통해 Heap 영역에 객체를 생성함
		Student lim = new Student();
		lim.name = "우별림";
		lim.kor = 100;
		lim.math = 99;
		lim.eng = 98;
		// > 직접 접근을 통해 값 초기화
		
		System.out.println(lim.name + "님의 국어 점수는 " + lim.kor + "이고, 수학 점수는 "
		                   + lim.math + "이며, 영어 점수는 " + lim.eng + "입니다.");
		// > 직접 접근을 통해 값 가져오기
		// > 우별림 객체를 관리하기 위해서는 lim 이라는 레퍼런스 변수만 알면 된다
		
		Student dong = new Student();
		dong.name = "홍길동";
		dong.kor = 30;
		dong.math = 40;
		dong.eng = 50;
		
		System.out.println(dong.name + "님의 국어 점수는 " + dong.kor + "이고, 수학 점수는 "
                + dong.math + "이며, 영어 점수는 " + dong.eng + "입니다.");
		
		
		// public으로 작업을 하게 되면 외부에서 직접 접근하여 값을 변질 시킬 수 있음
		// > 캡슐화 작업이 필요함
		
	}

	
}
