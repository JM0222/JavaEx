package com.javaex.practice;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		ex05();

	}
	public static void ex05() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int ans = 0;
		for (int i = 1; i <= 5; i++) {
			int num = scanner.nextInt();
			System.out.println("숫자: "+ num);
			if (num > ans) {
				ans = num;
			}
		}
		System.out.printf("최댓값은 %d 입니다" , ans);
		
	}

}
