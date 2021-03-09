package com.javaex.api.collections.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 는 인터페이스, 실체클래스는 List 관련 실체 클래스를 사용
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
			System.out.println("queue: " + queue);
		}
		
		// 데이터 확인
		int item = queue.peek();
		System.out.println("peek: " + item);
		item = queue.poll();
		System.out.println("pool: " + item);
		System.out.println("queue: " + queue);
		
		// queue 에서 pool 을 할떄는 
		// 비어있는지 반드시 확인해주자
		while (!queue.isEmpty()) {
			System.out.println("poll " + queue.poll());
		
		}
	}

}
