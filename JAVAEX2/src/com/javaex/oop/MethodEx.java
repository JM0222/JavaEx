package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		printDivide(5,3);
		printDivide(5,0);
		double result = getSum(4, 5);
		System.out.println(result);
		
		System.out.println(getSum2(1,2,3,4,5));
	}
	// 매개변수의 개수를 모를떄 => 가변인수
	private static double getSum2(double ...values) {
		double total = 0;
		for (double value:values) {
			total += value;
		}
		return total;
	}
	
	// 반환값을 받고자 한다면 return type 지정
	private static double getSum(double num1, double num2) {
		return num1 + num2; //return 값이 지정한 return type과 같아야함
	}
	
	// return 값이 없을 경우 void 타입 지정
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		System.out.println(num1 / num2);
	}

}
