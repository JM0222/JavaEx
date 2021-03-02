package com.javaex.practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		ex1();

	}
	public static void ex1() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

}
