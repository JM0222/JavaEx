package com.javaex.api.collections.hash;

public class Student {
	// 필드
	String name;
	int id;
	
	// 생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		// 객체의 유일 식별자 -> int
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			// 캐스팅 가능
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}
	
	
	
	

}
