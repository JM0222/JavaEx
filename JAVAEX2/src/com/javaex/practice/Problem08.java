package com.javaex.practice;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		ex08();

	}
	private static void ex08() {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		while (true) {
			int num = scanner.nextInt();
			if (num == 4) {
				System.out.println("선택>"+num);
				System.out.println("프로그램종료");
				break;
			} else if (num == 1) {
				System.out.println("선택>"+num);
				System.out.print("예금액>");
				total += scanner.nextInt();
			} else if (num == 2) {
				System.out.println("선택>"+num);
				System.out.print("출금액>");
				total -= scanner.nextInt();
			} else if (num == 3) {
				System.out.println("선택>"+num);
				System.out.println("잔고액>" + total);
			} else {
				System.out.println("다시 입력해주세요");
			}
			
		}
	}
}
