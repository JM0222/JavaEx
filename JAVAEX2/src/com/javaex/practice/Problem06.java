package com.javaex.practice;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		ex06();

	}
	private static void ex06() {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int total = 0;
		for (int i = 1; i <=num; i++) {
			if (num%2 == 0) {
				if (i%2 == 0) {
					total += i;
				}
			} else {
				if (i%2 != 0) {
					total +=i;
				}
			}
		}
		System.out.print("결과값: " + total);
		
	}
}
