package com.javaex.api.generics.v2;

// 설계시에는 내부 타입 지정하지않고 인스턴스화 할떄 내부 타입을 지정해주는 방식
public class GenericBox<T> { // <템플릿 문자> 
	
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	

}
