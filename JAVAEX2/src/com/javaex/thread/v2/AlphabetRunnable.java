package com.javaex.thread.v2;

// run 메소드만 구현, Thread의 생성자로 전달
public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		for (char ch = 'A'; ch<='Z'; ch++) {
			// 현재 Thread 를 구하려면 Thread.currentThread()
			System.out.println(Thread.currentThread().getName() +" : " + ch);
			
			// 잠시 대기: Wait 상태
			try {
			Thread.sleep(300); // 300ms,  0.3초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
