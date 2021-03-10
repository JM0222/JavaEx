package com.javaex.thread.synchronize;

public class SharedMemory {
	private int memory;

	public int getMemory() {
		return memory;
	}
	// 임계영역: 여러곳 동시 사용 x ->synchronized
	// 사용 끝날때까지 메서드 Lock;
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);//1초
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	} 
}
