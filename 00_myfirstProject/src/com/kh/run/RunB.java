package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {

	public static <B> void main(String[] args) {
		// 다른 클래스에 있는 메소드 실행할 때
		// 1. 사용하고자 하는 클래스 생성
		//    클래스명 사용하이름 = new 클래스명();
		B_ValuePrinter b = new B_ValuePrinter();    // > import 구문 처리
		
		// 2. 사용하고자 하는 메소드 호출
		//    사용할이름. 사용할메소드명();
		b.printValue1();
	}

}
