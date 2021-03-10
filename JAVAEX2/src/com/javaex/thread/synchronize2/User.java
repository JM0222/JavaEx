package com.javaex.thread.synchronize2;

public class User implements Runnable {
	private SharedMemory memory;
	private int data;
	
	public User(SharedMemory memory, int data) {
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
