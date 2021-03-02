package com.javaex.practice;

public class Problem04 {

	public static void main(String[] args) {
		ex04();

	}
	public static void ex04() {
		int s = 1;
		int e = 10;
		int cnt = 0;
		while (true) {
			if (cnt == 10) {
				break;
			} else {
				for (int i = s; i <= e; i++) {
					System.out.println(i);
				}
				s += 1;
				e += 1;
				cnt += 1;
			}
		}
	}

}
