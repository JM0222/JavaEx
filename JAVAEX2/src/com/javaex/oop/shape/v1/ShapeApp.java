package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(10,20); // 추상 클래스는 객체화 불가능
		Rectangle r = new Rectangle(10,10,100,50);
		r.draw();
		
		Circle c = new Circle(30,40,10);
		c.draw();

	}

}
