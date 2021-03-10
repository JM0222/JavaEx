package com.javaex.thread.synchronize;

public class User extends Thread{
	private SharedMemory memory;
	private int data;
	
	// 생성자
	public User(String name, SharedMemory memory, int data) {
		this.setName(name); // 쓰레드의 이름
		this.memory = memory;
		this.data = data;
	}

	@Override
	public void run() {
		if (memory != null) {
			memory.setMemory(data);
		}
	}
	
	
}
