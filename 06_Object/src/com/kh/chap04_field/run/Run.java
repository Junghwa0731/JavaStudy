package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		// 1. FieldTest1 > 필드 접근 제한자 테스트
		FieldTest1 f1 = new FieldTest1();
		// public > 어디서든 접근 가능
	    System.out.println(f1.pub);
		// protected > 같은 패키지 내에서 접근 가능 + 상속 구조라면 다른 패키지도 가능
	    // System.out.println(f1.pro);  > 다른 패키지면서 상속 구조도 아니여서 접근 불가
	    System.out.println(f1.getPro()); // getter 메소드를 통해 값을 알아와야 함
	    // default > 같은 패키지 내에서만 접근 가능
	    // System.out.println(f1.def);  > 다른 패키지이기 때문에 접근 불가
	    System.out.println(f1.getDef());  // getter 메소드를 통해 값을 알아와야 함
	    // private > 같은 클래스 내에서만 접근 가능
	    // System.out.println(f1.pri);
	    System.out.println(f1.getPri());
	    
	    // 2. FieldTest2 > 변수 선언 위치에 따른 구분(전역, 지역, 매개)
	    FieldTest2 f2 = new FieldTest2();
	    f2.test(20);
	    
	    // 3. FieldTest3 > static 변수
	    // FieldTest3 f3 = new FieldTest3();
	    // > static 을 사용하기 위해서는 객체 생성 불필요
	    
	    // public static
	    System.out.println(FieldTest3.pubSta);
	    FieldTest3.pubSta = "changed public static";
	    System.out.println(FieldTest3.pubSta);
	    
	    //private static
	    System.out.println(FieldTest3.getPriSta());
	    FieldTest3.setPriSta("changed private static");
	    System.out.println(FieldTest3.getPriSta());
	    
	    // 4. FieldTest4 > 상수 필드
	    System.out.println(FieldTest4.NUM);
	    System.out.println(Math.PI);

	}

}
