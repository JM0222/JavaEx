package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton(); 생성자 private 이므로 안된다
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 ->" + s1);
		System.out.println("s2 ->" + s2);
		
		System.out.println(s1 ==s2);

	}

}
