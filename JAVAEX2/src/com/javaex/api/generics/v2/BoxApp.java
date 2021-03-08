package com.javaex.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		
		// Generic 으로 설계된 클래스는 인스턴스화 할때 내부데이터 타입을 지정할수있다
		GenericBox<Integer> intBox = new GenericBox(); // Integer 객체를 내부데이터타입
		GenericBox<String> strBox = new GenericBox(); // 내부 데이터 String
		
		intBox.setContent(2021);
		strBox.setContent("가나다");
		
		int retVal = intBox.getContent(); // 캐스팅 불필요
		String retVal2 = strBox.getContent();
		
		System.out.println(retVal);
		System.out.println(retVal2);
		

	}

}
