package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringTest();
		stringFOrmatEx();

	}
	private static void stringFOrmatEx() {
		// %s = 문자열 ,%d = 십진수 ,%n = 개행
		String fruit = "사과";
		int total = 10;
		int eat= 3;
		System.out.println(total + "개의" + fruit + "중에서" + eat + "개를 먹었다");
		// format 
		System.out.printf("%d개의 %s중에서 %d개를 먹었다", total, fruit, eat);
		// 템플릿 미리 만들어 두면 편함
		// ex)  String fmt = "%d %s %d";
		// 현재 이자율은 1.25% 입니다.
		System.out.printf("현재 이자율은 %f입니다.%n", 1.25f);
		String fmt = "현재 이자율은 %.2f%%입니다.%n"; // %.2f -> 소숫점 2쨰자리까지
		System.out.printf(fmt, 1.25f);
	}
	private static void stringTest() {
		String str;
		str = "JAVA";
		System.out.println(str);
		String str2 = "JAVA";
		System.out.println(str2);
		String str3 = new String("JAVA"); // 새 객체 생성
		System.out.println(str3);
		System.out.println("str == str2? " + (str == str2)); // 같은주소
		System.out.println("str == str3? " + (str == str3)); // 다른주소
		
		// 참조 타입의 ==, != -> 두 객체의 주소 비교
		// 값 비교 .equals() 메서드를 사용
		System.out.println("str과 str2의 내용이 같은가?" + str.equals(str2));
		System.out.println("str과 str3의 내용이 같은가?" + str.equals(str3));
	}

}
