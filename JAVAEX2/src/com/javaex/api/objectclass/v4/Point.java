package com.javaex.api.objectclass.v4;


// v3. 얕은 복제 
// 단순히 필드만 복제하는 것: 얕은 복제
public class Point implements Cloneable{ // clone() 메서드가 활성화 
	// 필드 
	
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 객체 출력 or 문자열과 연결될 떄 반환되는 문자열
	@Override
	public String toString() {
		return String.format("Point(x=%d,y=%d)", x,y);
	} 
	// 값의 비교를 수행
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// obj -> 캐스팅
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		// 다른 타입은 비교방법 정의 안되므로 부모의 equals 값을 그냥 리턴
		return super.equals(obj);
	}
	// getter/ setter
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
	// 복제 메서드
	public Point getClone() {
		// 객체 복제 
		Point clone = null;
		try {
			clone = (Point)clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
