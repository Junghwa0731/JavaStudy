package com.kh.chap05_initBlock.model.vo;

public class Product {
	// 1. 아무런 초기화 없이 Product 객체 생성 후 출력해보면 JVM이 정한 기본 값으로 객체 생성
	// 2. 필드에 명시적 초기화 한 후 객체 생성해서 출력해보면 해당 초기화 값으로 객체 생성
	
	// 멤버 변수 (인스턴스 변수)
	private String pName = "은하수";
	private int price = 1000000;
	
	// 클래스 변수 (static 변수)
	private static String brand = "샘성";
	
	// 3. static 블록 - 클래스 변수를 초기화 시키는 프로그램 시작 시 단 한번 초기화
	static {
		brand = "사과";
		
		// pName = "cyco";
		// price = 20000;
		// > static 블록은 프로그램 시작 시 동작하므로 인스턴스 변수들이 존재하지 않는 시점
	}
	
	// 4. 인스턴스 블록 - 인스턴스 변수를 초기화 시키는 블럭으로 객체 생성 시 마다 초기화 됨
	{
		pName = "아이뽕";
		price = 15000000;
		
		brand = "헬지";
		// > 인스턴스 블록에서는 static 필드도 초기화 가능
		// static 블록은 프로그램 시작 시 초기화, 인스턴스 블록은 객체 생성 이후 값 초기화
		// 따라서 인스턴스 블록에 명시한 값을 덮어쓰기 되었음
	}
	
	
	// 생성자
	public Product() {}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static String getBrand() {
		return brand;
	}
	public static void setBrand(String brand) {
		Product.brand = brand;
	}
	public String information() {
		return "Product [pName=" + pName + ", price="+ price + ", brand="+ brand + "]";
	}

}
