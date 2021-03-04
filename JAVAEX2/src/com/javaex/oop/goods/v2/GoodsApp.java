package com.javaex.oop.goods.v2;

public class GoodsApp {
	
	public static void main(String[] args) {
		// 객체 필드 셋팅
	
		Goods notebook = new Goods();
		
		notebook.setName("LG Gram");
		notebook.setPrice(150000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone SE");
		smartphone.setPrice(650000);
	
		System.out.printf("%s, %d%n", notebook.getName(),notebook.getPrice());
		notebook.showInfo();
		System.out.printf("%s, %d%n", smartphone.getName(),smartphone.getPrice());
		smartphone.showInfo();

	}

}
