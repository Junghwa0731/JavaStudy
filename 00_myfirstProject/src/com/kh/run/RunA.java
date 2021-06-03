package com.kh.run;

import com.kh.first.A_MethodPrinter;
// > 외부의 클래스를 사용하고자 할 떄 import 구문 작성
public class RunA {

	public static void main(String[] args) {
		// 다른 클래스에 있는 메소드를 실행하려면?
		
		// 1. 실행할 메소드가 있는 클래스를 생성
		//    클래스명 사용할이름 = new 클래스명();
		// com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		A_MethodPrinter a = new A_MethodPrinter();
		
		// 다른 패키지에 존재하는 클래스 이기 떄문에 인식할 수 없어 compile error 발생
		// > 앞에 패기키명을 명시하면 인식 가능 or import 구문 작성하면 인식 가능
		
		// 2. 메소드 실행(호출)
		//    사용할이름. 사용할메소드();
		
		/*
		a.methodA();
		a.methodB();
		a.methodC();
		*/
		
		// 메소드가 순차적으로 실행 된 걸 확인할 수 있음
		// 다른 방법으로 > methodA() 호풀만으로 똑같이 출력되도록 변경
		a.methodA();


	}

}
