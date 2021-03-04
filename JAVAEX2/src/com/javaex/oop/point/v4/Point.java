package com.javaex.oop.point.v4;

// v4. 상속 inheritance

public class Point {
	//필드
	// protected 상속받은 자식에서 접근을 허용
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	public void draw(boolean show) {
		String message = String.format("점[x=%d, y=%d]를", x, y);
		if (show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}

}
