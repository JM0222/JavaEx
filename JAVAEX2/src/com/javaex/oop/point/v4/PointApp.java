package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(5,10); // 기본 생성자
		p1.draw();
		p1.draw(false); // 오버로딩된 메서드 
		
		Point p2 = new Point(15, 30); // 사용자 정의 생성자
		p2.draw();
		p2.draw(false);  // 오버로딩된 메서드 
		
		
		ColorPoint cp = new ColorPoint(20,40, "red");
		cp.draw();
		cp.draw(false);
		
		// 부모 타입으로 자식을 참조할수있다
		Point cp3 = new ColorPoint(20,20,"blue");
		cp3.draw();
	}

}
