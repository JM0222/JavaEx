package com.javaex.oop.point.v2;

// v2. 생성자
public class Point {
	//필드
	
	private int x;
	private int y;
	
	public Point() {
		// 기본 생성자 -> 파라미터가 없음
		System.out.println("기본 생성자 호출");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("사용자 정의 생성자 호출");
	}
	// getter / setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d] 입니다.%n", x,y);
	}

}
