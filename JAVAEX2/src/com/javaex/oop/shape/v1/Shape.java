package com.javaex.oop.shape.v1;

// 추상 클래스  : 자식 클래스에게 필드, 메서드 상속역할
//             특정 기능의 구현을 강제
public abstract class Shape {
	// 필드
	protected int x;
	protected int y;
	
	// 생성자
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메서드 (구현부가 없다)
	public abstract void draw();
	public abstract double area();
}
