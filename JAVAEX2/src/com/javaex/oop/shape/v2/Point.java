package com.javaex.oop.shape.v2;

// 인터페이스내의 추상 메서드는 반드시 Override 한다
public class Point implements Drawable{
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
		
	}
	
	

}
