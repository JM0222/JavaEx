package com.javaex.thread.synchronize2;

public class MainThread {

	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory();
		Thread user1 = new Thread(new User(memory,100));
		user1.setName("김일번");
		Thread user2 = new Thread(new User(memory,200));
		user2.setName("김이번");
		user1.start();
		user2.start();

	}

}

