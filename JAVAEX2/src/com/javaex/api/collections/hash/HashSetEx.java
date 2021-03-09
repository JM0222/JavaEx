package com.javaex.api.collections.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		basicHashSetEx();
	}
	
	private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		// 요소 추가
		hs.add("java");
		hs.add("c");
		hs.add("python");
		System.out.println("hs: "+ hs);
		
		// size  (=length)
		System.out.println(hs.size());
		
		// contains 포함여부
		System.out.println("contains java: "+ hs.contains("java"));
		
		// 삭제
		hs.remove("c");
		System.out.println("hs: "+ hs);
		
		// Hashset 비우기
		hs.clear();
		System.out.println("hs: "+ hs);
	}
	

}
