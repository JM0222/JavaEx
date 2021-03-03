package com.javaex.practice2;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float total = 0;
		for (int i = 1; i <= 5; i++) {
			total += scanner.nextFloat();
		}
		System.out.printf("평균은 %.1f 입니다.",total/5);
	}

}
