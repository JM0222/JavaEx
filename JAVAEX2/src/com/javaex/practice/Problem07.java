package com.javaex.practice;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		ex07();

	}
	private static void ex07() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("======================");
			System.out.println("====숫자맞추기게임 시작=====");
			System.out.println("======================");
			int answer = (int)(Math.random()*100) +1;
			while (true) {
				int num = scanner.nextInt();
				if (num > answer) {
					System.out.println("더 낮게");
				} else if (num < answer) {
					System.out.println("더 높게");
				} else if (num == answer) {
					System.out.println("맞았습니다.");
					System.out.println("게임을 종료하시겠습니까?(y/n)");
					if (scanner.next().equals("y")) {
						System.out.println("======================");
						System.out.println("====숫자맞추기게임 종료=====");
						System.out.println("======================");
						System.exit(0);
					}
				}
			}
		}
	}
}
