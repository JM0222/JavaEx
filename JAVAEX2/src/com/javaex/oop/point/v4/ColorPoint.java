package com.javaex.oop.point.v4;

// 객체 상속 받기위해서 extends 키워드
// 최상위 부모는  java.lang.Object
public class ColorPoint extends Point{
	
	// 필드
	private String color;
	
	// 생성자를 만들지 않으면 기본 생성자를 선택한다
	
	// 생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모 생성자 호출
		this.color = color;
	}
	
	// getter / setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	// Override 1번방법 getter 이용 2번방법 protected 이용
	@Override
	public void draw() {
		// 오버라이드 되어도 부모의 메서드는 남아있다
		// 부모의 메서드를 호출하고자한다면 super 이용
		super.draw();
		System.out.printf("색:[x=%d, y=%d, %s", getX(), getY(), color);
	}
	
	@Override
	public void draw(boolean show) {
		String message = String.format("점[x=%d, y=%d]를", x, y,color);
		if (show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
		
	}
	
}
