package com.kh.chap05_initBlock.model.vo;

public class Product {
	// 1. �ƹ��� �ʱ�ȭ ���� Product ��ü ���� �� ����غ��� JVM�� ���� �⺻ ������ ��ü ����
	// 2. �ʵ忡 ����� �ʱ�ȭ �� �� ��ü �����ؼ� ����غ��� �ش� �ʱ�ȭ ������ ��ü ����
	
	// ��� ���� (�ν��Ͻ� ����)
	private String pName = "���ϼ�";
	private int price = 1000000;
	
	// Ŭ���� ���� (static ����)
	private static String brand = "����";
	
	// 3. static ��� - Ŭ���� ������ �ʱ�ȭ ��Ű�� ���α׷� ���� �� �� �ѹ� �ʱ�ȭ
	static {
		brand = "���";
		
		// pName = "cyco";
		// price = 20000;
		// > static ����� ���α׷� ���� �� �����ϹǷ� �ν��Ͻ� �������� �������� �ʴ� ����
	}
	
	// 4. �ν��Ͻ� ��� - �ν��Ͻ� ������ �ʱ�ȭ ��Ű�� ������ ��ü ���� �� ���� �ʱ�ȭ ��
	{
		pName = "���̻�";
		price = 15000000;
		
		brand = "����";
		// > �ν��Ͻ� ��Ͽ����� static �ʵ嵵 �ʱ�ȭ ����
		// static ����� ���α׷� ���� �� �ʱ�ȭ, �ν��Ͻ� ����� ��ü ���� ���� �� �ʱ�ȭ
		// ���� �ν��Ͻ� ��Ͽ� ����� ���� ����� �Ǿ���
	}
	
	
	// ������
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
