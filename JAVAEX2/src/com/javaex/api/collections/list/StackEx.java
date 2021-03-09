package com.javaex.api.collections.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Stack:" + stack);
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		System.out.println("PEEK: "+ stack.peek());
		System.out.println("Stack: "+ stack);
		
		// pop
		Integer item = stack.pop();
		System.out.println(item);
		System.out.println("Stack: "+ stack);
		System.out.println("empty: "+ stack.empty());
		
		// 순회
		while (!stack.empty()) {
			System.out.println("pop: " + stack.pop());
		
		}
	}

}
