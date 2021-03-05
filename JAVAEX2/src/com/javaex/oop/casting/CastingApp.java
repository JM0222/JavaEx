package com.javaex.oop.casting;

public class CastingApp {

	public static void main(String[] args) {
		// 자신의 인스턴스를 자신의 타입으로 참조
		
		Dog dog1 = new Dog("리트리버");
		dog1.eat(); // 상속 메서드
		dog1.walk(); 
		dog1.bark();  // 자신 메서드
		
		// 자식의 인스턴스를 부모의 타입으로 참조 할수있다(다형성)
		Animal dog2 = new Dog("치와와");
		dog2.eat();
		dog2.walk(); // 참조 타입의 설계도 내에있는것만 이용가능 
		            // Animal 내에 있는것만 가능
		
		// 참조타입 변경
		// Animal - > Dog    다운캐스팅
		((Dog)dog2).bark();
		
		Animal pet = new Dog("아지");
		pet.walk();
		pet.eat();
		pet = null;
		
		pet = new Cat("야옹");
		pet.eat();
		pet.walk();
//		((Dog)cat).bark(); // cat instance 는 dog 클래스의 instance 가 아님
		
		// 다운캐스팅 하기전 반드시 해당 instance 의 설계도 클래스를 인스턴스화한 것인지 확인
		if (pet instanceof Dog) { // Dog 클래스인가?
			((Dog)pet).bark();
		} else if (pet instanceof Cat) { // Cat 클래스인가?
			((Cat)pet).meow();
		}
		
	}

}
