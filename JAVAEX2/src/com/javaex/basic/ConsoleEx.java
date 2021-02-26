package com.javaex.basic;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();

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
