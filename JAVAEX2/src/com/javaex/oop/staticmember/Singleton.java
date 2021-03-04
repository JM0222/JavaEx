package com.javaex.oop.staticmember;


// 단 하나의 인스턴스만 유지
// 생성자 -> 접근 금지
public class Singleton {
	// static 영역에 단 하나의 인스턴스 객체를 담아둔다
	private static Singleton instance = new Singleton();
	
	// 생성자
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}

}
