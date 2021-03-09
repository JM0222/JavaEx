package com.javaex.exceptions;

import java.io.IOException;

public class ThrowsExcept {   // 내부 발생 예외를 호출한 메서드에서 처리할수있도록 함
	public void executeChecked() throws IOException { 
		System.err.println("강제 체크드 예외 발생");
		// 예외 발생 
		throw new IOException("강제 예외");
		// IOException 은 checked exception -> 반드시 예외 처리 필수
		
	}
	public void executeRuntime() {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션");
	} // unchecked 예외 -> 예외처리를 강요하지않음
	
	public double divide(int num1, int num2) {
		double result; 
		try {
			result = num1/ num2;
		}catch (ArithmeticException e) {
			// 예외 전환: 보다 구체적인 예외로 전환
			throw new CustomArithmeticException("사용자 정의 Excepiton", num1,num2);
		}
		return result;
	}

}
