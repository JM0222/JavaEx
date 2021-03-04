package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		
		// 1번쨰 로드 : static -> 생성자
		StaticEx s1 = new StaticEx();
		System.out.println("참조카운트:" + s1.refCount);
		System.out.println("참조카운트:" + StaticEx.refCount);
		// static 멤버는 new 를 하지 않고도 호출 가능
		
		// 2번쨰 로드 : static 블록은 수행 x
		StaticEx s2 = new StaticEx();
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		// 해제
		s1 = null;
		System.out.println("s1해제");
		System.out.println("참조카운트: " + StaticEx.refCount);
		
		// 임의로 gc 부르면 안댐
		System.gc(); // garbage collector
		try {
			Thread.sleep(1000);
			System.out.println("참조카운트:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}

	}

}
