package com.javaex.practice;

public class Problem03 {

	public static void main(String[] args) {
		ex03();

	}
	public static void ex03() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}