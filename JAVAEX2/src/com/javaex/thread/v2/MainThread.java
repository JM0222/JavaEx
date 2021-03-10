package com.javaex.thread.v2;

public class MainThread {

	public static void main(String[] args) {
		//main thread  A~Z 출력
		// sub thread  1~9 출력
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		// Thread Start
		thread.start(); // thread 화
		// thread run 메소드 호출 X thread start O
		
		Thread thread2 = new Thread(new AlphabetRunnable()); 
		// 생성자에 run 메서드가 구현된 Runnable 객체를 전달
		thread2.setName("AlphabetRunnable");
		thread2.start();
		
		
		// Working thread 의 제어권유지위해 작업 흐름을 main thread에 합류
		try {
			thread.join();
			thread2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인쓰레드 종료");

	}

}
