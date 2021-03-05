package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable{
	// 필드
	private double radius;
	
	// 생성자
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// 메서드 (추상메서드는 반드시 구현해야한다)
	
	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n",
				x, y, radius, area());
		
	}

	@Override
	public double area() {
//		double area = Math.PI * Math.pow(radius, 2); // pow = 제곱
//		return area;
		return Math.PI * Math.pow(radius, 2);
	}
	
	
}
