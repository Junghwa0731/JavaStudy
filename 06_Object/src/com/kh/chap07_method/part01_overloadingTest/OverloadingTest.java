package com.kh.chap07_method.part01_overloadingTest;


// ---------------------< 5/25 화요일차 강의 >----------------

public class OverloadingTest {
	// 오버로딩 테스트
	
	public void test() {}
	
	public void test(int a) {}
	
	public void test(int a, String s) {}
	
	public void test(String s, int a) {}
	
	public void test(int a, int b) {}
	
	/*public void test(int c, int d) {
	  
	 }*/  //  > 에러 발생 : 매개변수명과 무관하고 자료형의 타입/갯수/순서가 다르게 작성 되어야 함
	
	public void test(int a, int b, String s) {}
	
	/*public int test(int a, int b, String s) {
		return 0;
	}*/ // > 에러 발생 : 반환형이 다르다고 오버로딩 적용 되지 않음.
	
	/*private void test(int a, int b, String s) {}
	*/ //  > 에러 발생 : 접근 제한자가 다르다고 오러로딩 적용 되지 않음.
	
	public static void main(String[] args) {
		OverloadingTest o1 = new OverloadingTest();
		o1.test();
		o1.test(10);
		o1.test(10, "abc");
		o1.test("abc", 10);
		o1.test(10, 20);
		o1.test(10, 20, "abc");
		System.out.println();
		// > 오버로딩은 메소드명이 같은 경우 발생
		//   접근 제한자, 반환형과는 무관하게 매개변수의 자료형과 갯수 순서가 다르게 작성되어야만 함
		//   많은 java api 기능들이 오버로딩 되어 있음
		
	}

}
