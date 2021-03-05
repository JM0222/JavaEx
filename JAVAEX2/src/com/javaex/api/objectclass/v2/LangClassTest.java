package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		// 참조 타입의 == : 주소 비교( 같은 객체? )
		// 참조 타입에서 값의 비교: .equals();
		
		System.out.println(p.equals(p2)); // false
		System.out.println(p == p2); // false

	}

}
