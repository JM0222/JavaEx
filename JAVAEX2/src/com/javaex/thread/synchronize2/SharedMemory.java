package com.javaex.thread.synchronize2;

public class SharedMemory {
	private int memory;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(1000);//1초
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}

}
