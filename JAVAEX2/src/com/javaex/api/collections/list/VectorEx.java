package com.javaex.api.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터의 선언
		Vector<Integer> v = new Vector<>();
		System.out.println("Size: " + v.size() + " Capacity: " + v.capacity());
		
		/// 1~10 까지의 값 할당
		for (int i = 1; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println("v: "+ v);
		System.out.println("Size: " + v.size() + " Capacity: " + v.capacity());
		
		// 수용량 초과
		v.addElement(11);
		System.out.println("Size: " + v.size() + " Capacity: " + v.capacity());
		
		v.insertElementAt(13, 1); //13 를 1번 인덱스에 삽입
		System.out.println("v: "+ v);
		
		// 객체 참조  객체의 1번값 반환
		System.out.println("5번 인덱스의 객체: "+ v.elementAt(1));
		
		// 객체 검색 
		int index = v.indexOf(6); // 6을 검색 idx 반환  
		System.out.println("index of 6: " + index);
		index = v.indexOf(0);  
		System.out.println("index of 0: " + index); // 0이 없으면 -1 반환
		
		// 포함 여부 확인
		// 내부에 10 객체 포함?
		System.out.println("v가 10을 포함하는가? " + v.contains(10)); //boolean 값 반환
		
		// 객체의 삭제
		System.out.println("v: "+ v); // v: [1, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
		v.removeElement(13); // 내부에서 13을 삭제
		System.out.println("v: "+ v);
		
		// 내부 객체를 출력
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		
		for (Integer item:v) {
			System.out.print(item + " ");
		}
		System.out.println();
		// Collection Frame 같은 경우 
		// Vector -> Enumeration 을 받아와서 순회: 권장 (메모리 효율)
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) { // 뒤에 담겨있는지 확인
			Integer item = e.nextElement(); // 데이터 꺼내고 , 뒤로 이동
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 백터 비우기
		v.clear();
		System.out.println("v: " + v);
		System.out.println("Size:" + v.size()+ " Capacity: "+ v.capacity());
	
	}

}
