package com.javaex.api;

public class WrapperEx {

	public static void main(String[] args) {
		// 만들기
		// deprecated: 향후 삭제될 예정
		Integer i = new Integer(10);
		Float f = new Float(3.14159f);
		// valueOf() static 메서드 이용 
		Character c = Character.valueOf('c');
		
		// 문자열로 초기화할수있다
		Integer i2 = Integer.valueOf("10");
		Float f2 = Float.valueOf("3.14f");
		Boolean b2 = Boolean.valueOf("false");
		// 파라미터로 전달된 문자열이 해당 타입으로 변환될수있는 형태의 문자열이어야함
		
		// 자동박싱이 지원
		Integer i3 = 10; // Integer i3 = Integer.valueOf(10);
		// 유틸리티 메서드들
		// parse 계열 메서드: 문자열을 이용, 해당 타입으로 변환, 다른 형태로 출력
		System.out.println(Integer.parseInt("-123")); // 문자열 -> 정수
		System.out.println(Integer.parseInt("FF", 16)); // 16진수 FF -> 정수로 변환
		System.out.println(Integer.toBinaryString(28)); // 28을 2진수 형태의 문자열로 출력
		System.out.println(Integer.toHexString(28)); // 28을 16진수 형태의 문자열로 출력
		
		// 형변환 메서드
		double d4 = i3.doubleValue(); // int -> double 형변환
		System.out.println(d4);
		
		// 포장 클래스 역시 객체다
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		System.out.println("i4 == i5?" + (i4 == i5)); // false임을 주의
		// 포장 클래스 == 포장 클래스 -> 두 객체의 주소를 비교한 것
		// 값의 비교를 위해서는 unboxing 비교 , equals 비교를 해야한다
		
		System.out.println(i4.equals(i5));
		System.out.println(i4.intValue() == i5.intValue());
	}

}
