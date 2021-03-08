package com.javaex.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		intBox intBox1 = new intBox();
		
		intBox1.setContent(2021);
		
		int retVal = intBox1.getContent();
		System.out.println(retVal);
		
		StringBox stringbox = new StringBox();
		
		stringbox.setContent("가나다");
		
		String strVal = stringbox.getContent();
		System.out.println(strVal);
		
		ObjectBox objBox = new ObjectBox();
		objBox.setContent(2021);

		ObjectBox objBox2 = new ObjectBox();
		objBox2.setContent("가나다");
		
		Integer retVal2 = (Integer)objBox.getContent();
		

	}

}
