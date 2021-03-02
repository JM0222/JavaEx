package com.javaex.basic;

import java.util.Scanner;
public class LoopEx {

	public static void main(String[] args) {
//		whileEx01(); 
//		whileEx02();
//		doWhileEx();
//		infLoop();
//		forEx();
//		forEx2();
//		breakEx();
//		forEx3();
		forEx4();

	}
	private static void forEx4() {
		for (int i = 1; i <= 5; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void forEx3() {
		for (int i = 2; i<10; i++) {
			for (int j = 1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
	private static void breakEx() {
		int x = 1;
		while (true) {
			if (x%6 == 0 && x%14 == 0) {
				System.out.println(x);
				break;
			}
			x++;
		}
		
	}
	private static void forEx2() {
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
		
	}
	private static void forEx() {
		System.out.print("단을 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + " = " + (num*i));
		}
		scanner.close();
	}
	private static void infLoop() {
		// 무한 루프 주의
		while (true) {
			System.out.println("Ctrl + c to Quit");
		}
	}
	private static void doWhileEx() {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int total = 0;
		do {
			System.out.print("정수를 입력하세요 [0은 종료]: ");
			num = scanner.nextInt();
			total += num;
		} while (num != 0);
		
		System.out.println("합산값: " + total);
		scanner.close();
	}
	private static void whileEx02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요: ");
		int num = scanner.nextInt();
		int x = 1;
		
		while (x < 10) {
			System.out.println(num + "*" + x + "=" + (num * x));
			x += 1;
		}
		scanner.close();
		 
		
	}
	// while 문 
	// 종료조건 반드시 설정 
	private static void whileEx01() {
		int x = 1;
		       // 조건 
		while (x < 10) {
			System.out.println("I like java"+x);
			x += 1; 
		}
		
		
	}

}
