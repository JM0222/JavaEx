package com.javaex.api.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		listClassEx();

	}
	private static void listClassEx() {
		// List 관련 클래스는 List 인터페이스를 구현하고 있다(java.util.List)
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		
		System.out.println("lst: " + lst);
		System.out.println("size of lst:" + lst.size());
		
		// 객체 추가 // lst: [java, python]
		lst.add("java");
		lst.add("python");
		System.out.println("lst: " + lst);
		
		// 객체 삽입 // lst: [java, c++, python]
		lst.add(1,"c++");
		System.out.println("lst: " + lst);
		
		// List는 중복 삽입을 허용 // lst: [java, c++, python, java]
		lst.add("java");
		System.out.println("lst: " + lst);
		
		// 조회
		System.out.println("idx 2: " + lst.get(2));
		
		// 반복자를 이용한 순회: 추천
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) { // 뒤에 내용이 더있나?
			String item = it.next();
			System.out.print(item+" ");
		}
		System.out.println();
		// 객체의 삭제 // lst: [c++, java]
		lst.remove(2);
		lst.remove("java");
		System.out.println("lst: " + lst);
		
		// 검색 (없는객체 검색시 -1 반환)
		int position = lst.indexOf("java");
		System.out.println(position);
	}

}
