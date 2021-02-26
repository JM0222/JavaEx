package com.javaex.basic.types;

// byte(1) < short (2) < int(4) < long(8)

public class intLongEx {

	public static void main(String[] args) {
		int intVar = 2021;
		// 타입의 범위를 넘어가는 값을 할당할수는없다.
		int intVar2;
//		intVar2 = 123456789012345; 
		// int의 범위 즉 4byte 초과하기때문에 오류
		long longVar = 2021;
		long longVar2 = 123456789012345L;
		// long 임을 확인하는 L or l
		// 정수형데이터는 int형이 기본이므로 
		short s1 = 100;
		short s2 = 200;
		
//		short result = s1 + s2;
		// 정수 + 정수 연산일경우 short or byte는 int로변환되기떄문
		
		int result = s1 + s2;
		
		System.out.println(s1 + "+" + s2 + "=" + result);
		
		int bin, oct, hex;
		
		bin = 0b1100; // 0b 접두어 -> 2진수
		
		oct = 072; // 0 접두어 -> 8진수 
		
		hex = 0xFF; // 0x 접두어 -> 16진수 
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}   

}
