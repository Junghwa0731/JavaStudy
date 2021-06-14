package com.kh.practice1.run;

import com.kh.practice1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		p.setpName("½Å¹ß001");
		p.setPrice(100);
		p.setBrand("made in korea");
		
		System.out.println(p.information());

	}

}
