package com.javaex.oop.goods.v2;


// v2 . 필드  -> 내부 데이터 혹은 상태 변수
// getter setter 이용한 필드 우회 접근
public class Goods {
	// 필드
	// 접근 제한
	private String name;
	private int price;
	
	// Getter/Setter 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; // this 현재 instance
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	// 출력용 메서드
	public void showInfo() {
		System.out.printf("상품: %s%n가격: %d%n", name,price);
	}

}
