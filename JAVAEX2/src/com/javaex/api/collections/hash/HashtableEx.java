package com.javaex.api.collections.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		// Map 인터페이스
		Map<String, ClassRoom> map = new Hashtable<>();
		
		// 인덱스 접근이 아니라 키를 이용한 접근
		map.put("101", new ClassRoom("Java","R101"));
		map.put("202", new ClassRoom("Python","R202"));
		map.put("303", new ClassRoom("C","R303"));
		
		System.out.println("MAP: " + map);
		// 키셋 -> hashset -> 순서가 없다
		
		// 조회
		ClassRoom room = map.get("202"); // 키접근
		System.out.println("202강의장 " + room);
		
		// 값의 변경
		map.put("202", new ClassRoom("Linux","R202"));
		System.out.println("MAP: " + map);
		
		// 반복자 활용
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom item = map.get(it.next());
			System.out.println(item);
		}
		
		
		// 삭제
		map.remove("202");
		
		// clear
		map.clear();
		
		// 특정 키가 포함되어 있는가?
		System.out.println(map.containsKey("202"));
		// 특정 value가 포함되어 있는가?
		System.out.println(map.containsValue(new ClassRoom("Java")));
	}

}
