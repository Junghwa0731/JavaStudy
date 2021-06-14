package com.kh.chap04_field.model.vo;

public class FieldTest1 {
	// 클래스에서 사용 가능한 접근 제한자는 public, default
	// 필드에서 사용 가능한 접근 제한자는 4가지
	
	// public        > 어디서든(같은 패키지, 다른패키지) 접근 가능
	// protected     > 같은 패키지 접근 가능 + 만약 다른 패키지라면 상속 구조에서 접근 가능
	// default       > 같은 패키지 접근 가능 
	// private       > 오직 자기 자신 클래스에서만 접근 가능
	
	// 1. 필드
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String def = "default";    // default 는 예약어 생략하는 것
	private String pri = "private";
	
	// 2. 생성자
	public FieldTest1() {}
	
	// 3. 메소드 (getter / setter)
	// pub > 직접 접근이 가능하므로 getter / setter 불필요
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
	public String getPri() {
		return pri;
	}
	public void setPri(String pri) {
		this.pri = pri;
	}
	
	
}
