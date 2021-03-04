
package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
//		enumTest();
		enumTest2();
	}
	private static void enumTest2() {
		Week today = Week.WEDNESDAY;
		String message;
		
		switch(today) {
		case SUNDAY:
			message = "일요일";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			message = "평일";
			break;
		case FRIDAY:
			message = "금요일";
			break;
		case SATURDAY:
			message = "주말";
			break;
		default:
			message= "?";
		}
		System.out.printf("%s에는 %s%n", today.name(),message);
		
	}
	private static void enumTest() {
		Week today = Week.WEDNESDAY;
		System.out.printf("Today is %s(%d)%n", today.name(), // 열거상수 string
				today.ordinal()); // 열거상수 idx 반환
		
		// String -> 열거 상수로 변환
		
		Week other = Week.valueOf("FRIDAY");
		System.out.printf("other is %s(%d)%n", other.name(),
				other.ordinal());
		
		// 열거 상수의 순번 비교
		System.out.println(other.compareTo(today));
		// 두 열거 상수의 순번차
		
		Week[] days = Week.values(); // Week enum 타입 모든 열거상수반환
		
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%s(%d)%n", 
					days[i].name(),
					days[i].ordinal());
		}
	}

}
