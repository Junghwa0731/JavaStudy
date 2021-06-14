package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 1. 필드부
	// 접근제한자 [예악어] 자료형 변수형;
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// 2. 생성자부 : 객제를 생성하기위한 일종의 메소드
	// 접근제한자 클래스명([매개변수]){}
	public Student() {}
	
	// 3. 메소드부 : 기능을 구현하는 부분
	// 접근제한자 반환형 메소드명 ([매개변수]) { }
	
	// 3_1. setter
	// 데이터(필드) 들을 기록 및 수정하는 기능을 하는 메소드
	// 이 때 메소드는 외부 접근 가능하도록 해야하기 때문에 public 접근 제한자 사용
	// 값 설정 후 반환 값은 필요 없으므로 void (반환 값 없음)
	// 메소드명은 카멜표기법을 사용하여 통상 setXXX로 작성
	// ex) setName, setKor, setMath, ...
	// 매개변수명은 관례상 필드명과 동일하게 사용
	
	public void setName(String name) { // 이름을 매개변수로 받아 변경해주는 메소드
		// name = name;
		// > 매개변수 name = 매개변수 name;
		// { } 구역에서는 해당 지역에서 만들어진 변수의 우선 순위가 높기때문 
		
		// 멤버변수 name = 매개변수 name;
	    this.name = name;   // > this에는 해당 객체의 주소값이 담겨 있음
		
	}
	
	// 국어 점수를 매개변수로 받아 변경해주는 메소드
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	// 수학 점수를 매개변수로 받아 변경해주는 메소드
	public void setMath(int math) {
		this.math = math;
	}
	
	// 영어 점수를 매개변수로 받아 변경해주는 메소드
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 3_2. getter
	// 필드 값을 반환해주는 기능을 하는 메소드
	// 외부에서 접근하기 위해 접근 제한자 public 사용
	// 필드 값을 반환해주므로 필드 값의 자료형과 동일한 반환형
	// 카멜 표기법을 사용하여 getXXX로 통상 지어줌
	// ex) getName, getKor, getMath, getEng ...
	// 해당 메소드로 전달되는 값이 없으므로 매개변수 없음
	
	// 이름을 반환하는 메소드
	public String getName() {
		return name;
	}
	
	// 국어 점수를 반환하는 메소드
	public int getKor() {
		return kor;
	}

	// 수학 점수를 반환하는 메소드
	public int getMath() {
		return math;
	}

	// 영어 점수를 반환하는 메소드
	public int getEng() {
		return eng;
	}
	
	// 모든 필드 값을 합친 문자열을 반환하는 메소드
	public String information() {
		return "이름 : " + name + ", 국어점수: " + kor + ", 수학 점수 : " + math + ", 영어 점수 : " + eng;
	}
		
		
	
}
