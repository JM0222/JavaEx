package com.javaex.oop.goods.v3;


// v3 . 생성자  
// new 키워드와 함께 사용되고 객체의 초기화를 담당한다.
public class Goods {
	// 필드
	
	private String name;
	private int price;
	
	// 모든 필드를 초기화하는 생성자
	// 기본 생성자를 추가 (자동)
	// 사용자 정의 생성자가 있으면 기본생성자를 추가하지 않는다.
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// Getter/Setter
	// 데이터 변경 제한가능
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name; // this 현재 instance
//	}
//	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	// 출력용 메서드
	public void showInfo() {
		System.out.printf("상품: %s%n가격: %d%n", name,price);
	}

}
