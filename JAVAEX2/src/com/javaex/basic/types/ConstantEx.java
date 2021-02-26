package com.javaex.basic.types;

public class ConstantEx {
	static final int SPEED_LIMIT = 120;

	public static void main(String[] args) {
		// 상수 : 변하지 않는 수  
		// 선언, 초기화, 조회는 가능, 변경 불가
		int speed = 120;
		
//		final int SPEED_LIMIT = 110; 
		// final -> 할당 이후에 변경 불가 
		
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("제한속도 초과? " + b1);
		
		System.out.println("제한속도는 "+ SPEED_LIMIT);

	}

}
