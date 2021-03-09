package com.javaex.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
//		arithExceptionEx();
//		arrayExceptionEx();
//		nullPointerExceptionEx();
		throwExceptEx();
		System.out.println("END");
	}
	private static void throwExceptEx() {
		// 호출된 메서드 내에서 발생한 예외는 가급적
		// 호출한 메서드 내에서 예외처리하는 것이 바람직
		ThrowsExcept except = new ThrowsExcept();
		// checked 예외 처리 예제
//		try {
//			except.executeChecked(); // checked Exception 
//		} catch (IOException e) {
//			System.err.println("호출된 메서드에서 checked 예외 발생");
//		}
		// unchecked 예외 처리 예제
		try {
//			except.executeRuntime();
			except.divide(100, 0);
		}catch(CustomArithmeticException e) {
			System.err.println("msg: " + e.getMessage());
			System.err.println("나누어지는수: "+ e.getNum1());
			System.err.println("나누는 수: "+ e.getNum2());
		}catch(RuntimeException e) {
			// 호출된 메서드 내에서 발생한 예외를 이곳에서 위임 처리
			System.err.println("호출된 메서드에서 unchecked 예외 발생!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외 처리 완료!");
		}
	}
	
	
	
	private static void nullPointerExceptionEx() {
		String str = new String("Hello");
		
		str = null; // 참조가 해제 NullPointerException
		try {
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.err.println("errmsg:" + e.getMessage());
			System.err.println("err: " + e.getClass().getSimpleName());
		}
	}
	
	
	private static void arrayExceptionEx() {
		int [] intArray = new int[] {3,6,9};
		try {
			System.out.println(intArray[3]); //ArrayIndexOutOfBoundsException
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("에러메시지: " + e.getMessage());
			System.err.println("발생한 예외: "+ e.getClass().getSimpleName());
		}
	}	
	
	
	
	private static void arithExceptionEx() {
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력: ");
		try {
			// 예외 발생 가능 코드
			num = scanner.nextInt();
			result = 100 / num;
		} catch (InputMismatchException e) {
			System.err.println("정수가 아닙니다");
		} catch (ArithmeticException e) {
			System.err.println("0으로는 나눌수 없어요");
			System.err.println("msg:" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace(); // 예외 코드 전체를 출력
		} finally {
			System.out.println("Finally"); // 예외 발생 관계 없이 항상 실행
		}
		System.out.println("결과: " + result);
		scanner.close();
	}

}
