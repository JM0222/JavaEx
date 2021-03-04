package com.javaex.oop.point.v1;

public class Point {
	//필드
	private int x;
	private int y;
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
