package com.javaex.api;


// 사용자 정의 클래스를 비교할떄
// Comparable 인터페이스를 구현하고 있어야한다
public class Member implements Comparable {
	// 필드
	String name;
	
	// 생성자
	
	public Member(String name) {
		this.name = name;
	}
	// 메소드

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	// 두 객체의 대소 비교 로직 
	@Override
	public int compareTo(Object o) {
		// -1, 0, 1
		// 두 대상이 같으면 : 0
		// 앞의 값이 작으면 : -1 , 앞의 값이 크면 : 1
		// 매개변수로 부터 넘어온 o가 Member인가?
		if (o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name); // 두 객체의 필드 name의 선후 관계를 비교
		}
		return 0;
	}
	

}
