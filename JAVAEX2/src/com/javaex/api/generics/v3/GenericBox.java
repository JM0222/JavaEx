package com.javaex.api.generics.v3;

// T: Type
// R: Return Type
// K: Key
// V: Value
// ... 다양한 템플릿 문자 사용 가능
public class GenericBox<K, V> { // 내부에서 사용할 Key, Value의 타입을 미정 상태로 설계 
	K key;
	V content;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getContent() {
		return content;
	}
	public void setContent(V content) {
		this.content = content;
	}
	
}
