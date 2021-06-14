package com.kh.chap07_method.part02_methodTest.run;

import java.util.Arrays;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap07_method.part02_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method.part02_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		NonStaticMethod test = new NonStaticMethod();
		
		// 1. 매개변수와 반환값이 없는 메소드 호출
		test.method1();
		
		// 2. 매개변수가 없고반환값이 있는 메소드 호출
		//    그 반환형과 일치하는 자료형의 변수에 메소드 수행 후의 반환 값을 담아서 사용
		String str = test.method2();
		System.out.println(str);
		
		// 3. 매개변수가 있고 반환값이 없는 메소드 호출
		test.method3(20, 10);
		// > 반드시 전달 값은 매개변수의 타입과 순서와 개수가 일치하는 값을 넘거주어야 함
		
		// 4. 매개변수가 있고 반환값이 있는 메소드 호출
		int num1 = 3;
		int num2 = 5;
		int result = test.method4(num1, num2);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		System.out.println("result : " + result);
		
		// 5. 매개변수와 반환형이 배열인 경우
		int[] arr = {1, 2, 3, 4, 5};
		int[] returnArr = test.method5(arr);
	    System.out.println(Arrays.toString(arr));
	    System.out.println(Arrays.toString(returnArr));
	    
	    // 6. 매개변수와 반환형이 객체인 경우
	    Person p = new Person();
	    p.setName("우별림");
	    p.setAge(20);
	    Person returnPerson = test.method6(p);
	    System.out.println(p.information());
	    System.out.println(returnPerson.information());
	    
	    // 7. 가변인자
	    System.out.println(test.method7(1));
	    System.out.println(test.method7(1,2));
	    System.out.println(test.method7(1,2,3));
	    System.out.println(test.method7(1,2,3,4));
	    
	    // -------------------------------------------------
	    // StaticMethod의 경우 객체 생성하지 않고 호출
	    // 이미 프로그램 시작 시 Static 영역에 메소드가 저장 되어 있기 떔ㄴ
	    // 클래스명, 메소드명();
	    StaticMethod.method1();
	    
	    System.out.println("10과 20의 합은 "+ StaticMethod.method2() + "입니다.");
	    
	    StaticMethod.method3("우별림");
	    
	    System.out.println(StaticMethod.method4("우별림"));

	}

}
