package kr.or.shi.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		
		//stack (LIFO)    --복사기 용지
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		//queue (FIFO)     --수도호스, 파이프
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		
		System.out.println("=스택=");
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println("=큐=");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
