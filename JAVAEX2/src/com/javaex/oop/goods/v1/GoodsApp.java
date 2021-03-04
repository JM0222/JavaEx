package com.javaex.oop.goods.v1;

public class GoodsApp {
	
	public static void main(String[] args) {
		// 객체 필드 셋팅
	
		Goods notebook = new Goods();
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 650000;
		
		System.out.printf("%s, %d%n", notebook.name,notebook.price);
		System.out.printf("%s, %d%n", smartphone.name,smartphone.price);

	}

}
