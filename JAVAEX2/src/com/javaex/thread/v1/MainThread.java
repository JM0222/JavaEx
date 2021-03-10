package com.javaex.thread.v1;

public class MainThread {

	public static void main(String[] args) {
		//main thread  A~Z 출력
		// sub thread  1~9 출력
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		// Thread Start
		thread.start(); // thread 화
		// thread run 메소드 호출 X thread start O
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("MainThread:" + ch);
			
			// 잠시 대기: Wait 상태
			try {
			Thread.sleep(300); // 300ms,  0.3초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
