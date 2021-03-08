package com.javaex.api.generics.v3;

public class BoxApp {

	public static void main(String[] args) {
		
		// key 타입이 string, value 타입이 int 
		GenericBox<String, Integer> intBox = new GenericBox<>();
		intBox.setKey("Integer");
		intBox.setContent(2021);
		
		String strbox = intBox.getKey();
		int retVal = intBox.getContent();
		
		System.out.println(strbox);
		System.out.println(retVal);
		
	}

}
