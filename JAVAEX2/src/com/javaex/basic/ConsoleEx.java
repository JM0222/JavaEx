package com.javaex.basic;

// 클래스 import 

import java.util.Scanner;
public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();
		consoleInputEx();

	}
	// 콘솔 입력
	private static void consoleInputEx() {
		Scanner scanner = new Scanner(System.in); // 키보드 input()
		System.out.print("이름은?");
		String name = scanner.next(); // 문자열 입력
		System.out.print("나이는?");
		int age =scanner.nextInt();  // 정수 입력
		System.out.println("이름: " + name + " 나이는 " + age);
		// 사용이후 반드시 Scanner 닫아줘야한다.
		scanner.close();
	}
	// 콘솔 출력
	private static void consoleOutputEx() {
		// 표준 출력 (stdout): System.out
		// 표준 에러 (stderr): System.err
		// 메서드 println() -> 출력 후 개행
		// printf() -> 포멧 출력
		
		System.out.print("Hello"); // 개행 x
		System.out.println("java");
		System.out.println("New Line");
		
		// escape 문자 
		// \n(개행) , \t(탭), \"(따옴표), \\ (역슬래시 하나)
		System.out.println("Hello \nJAVA");
		System.out.println("Hello \t\tJAVA");
		System.out.println("Hello \"JAVA\"");
		
		String filePath ="D:\\myFolder\\myfile.txt";
		System.out.println(filePath);
	}

}
