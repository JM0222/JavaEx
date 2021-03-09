package com.javaex.api.collections.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
//		basicHashSetEx();
		customHashSetEx();
		
	}
	private static void customHashSetEx() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("전우치", 30);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생부: " + hs);
		Student s4 = new Student("홍길동", 10);
		hs.add(s4);
		System.out.println("hashcode of s1: " + s1.hashCode());
		System.out.println("hashcode of s4: " + s4.hashCode());
		System.out.println("s1 == s4? " + s1.equals(s4));
		
		// 포함 여부 확인
		boolean exists = hs.contains(new Student("홍길동", 10));
		System.out.println("홍길동 , 10 이 존재? " + exists);
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
