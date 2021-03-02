package com.javaex.basic;

import java.util.Scanner;
public class Conditional {

	public static void main(String[] args) {
//		ifEx();
//		ifElseEx();
//		ifPractice();
//		switchEx();
//		switchEx2();
//		switchEx3();
//		ifEx2();
		ifEx3();
		
		

	}
	private static void ifEx3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("A등급");
		} else if (score >= 80 && score < 90) {
			System.out.println("B등급");
		} else if (score >= 70 && score < 79) {
			System.out.println("C등급");
		} else if (score >= 60 && score < 69) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		scanner.close();
	}
	private static void ifEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		if (score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		scanner.close();
	}
	// java case 문에는 char, string 도 가능
	private static void switchEx3() {
		String day = "FRI";
		String msg;
		// 요일 변수 : 지정된 범위의 값만 들어와야 한다.
		switch (day) {
		case "SUN":
			msg = "일요일";
			break;
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			msg = "열공";
			break;
		case "FRI":
			msg = "불금";
			break;
		case "SAT":
			msg = "주말";
			break;
		default:
			msg = "?";
		}
		System.out.println(day + "에는 " + msg);
		
	}
	// switch case 2
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1: // 하나로 묶임
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일입니다.");
			break;
		default:
			System.out.println("?");
			
		}
		scanner.close();
	}
	
	// switch ~ case
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목을 선택하세요 \n(1.자바  2.C  3.c++  4.Python):");
		
		int code = scanner.nextInt();
		
		switch (code) {
		case 1:
			System.out.println("R101");
			break;
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default:  // if 문의 else 와 같은 기능
			System.out.println("관리자에게 문의하세요.");
		}
		scanner.close();
	}
	private static void ifPractice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목을 선택하세요 \n(1.자바  2.C  3.c++  4.Python):");
		int num = scanner.nextInt();
		System.out.println("과목번호: " + num);
		
		if (num == 1) {
			System.out.print("R101호 입니다.");
		} else if (num == 2) {
			System.out.print("R202호 입니다.");
		} else if (num == 3) {
			System.out.print("R303호 입니다.");
		} else if (num == 4) {
			System.out.print("R404호 입니다.");
		} else {
			System.out.print("나머지는 \"상담원에게 문의하세요 ^^\"");
		}
		scanner.close();
		
	}
	// else if 문
	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
//		if (num > 0) {
//			System.out.print("양수입니다.");
//		} else if (num == 0) {
//			System.out.print("0입니다.");
//		} else {
//			System.out.print("음수입니다");
//		}
//		scanner.close();
		// 중첩 if 문
		if (num == 0) {
			System.out.println("0입니다");
		} else {
			if (num > 0) {
				System.out.println("양수입니다");
			} else {
				System.out.println("음수입니다");
			}
		}
		scanner.close();
	}
	
	// if 문 
	private static void ifEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
		
	}
	

}
