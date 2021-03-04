package com.javaex.oop.goods.v4;

public class GoodsApp {
	
	public static void main(String[] args) {
		// 객체 필드 셋팅
	
		
		Goods notebook = new Goods("LG Gram", 1500000); // 사용자 정의 생성자
		
		Goods smartphone = new Goods("iPhone", 650000);
		
//		notebook.setPrice(15000);
//		notebook.showInfo();
		
		System.out.printf("%s, %d%n", notebook.getName(),notebook.getPrice());
		notebook.showInfo();
		System.out.printf("%s, %d%n", smartphone.getName(),smartphone.getPrice());
		smartphone.showInfo();

	}

}
