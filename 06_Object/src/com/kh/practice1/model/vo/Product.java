package com.kh.practice1.model.vo;

public class Product {
	private String pName;   // 제품명
	private int price;      // 가격
	private String brand;   // 제조사
	
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String information() {
		return "제품명은 " + pName + "이며, 가격은 " + price + "원이며, 제조사는 " + brand + "이다."; 
	}
}
