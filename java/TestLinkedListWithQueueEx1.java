package tw.leonchen.myproject.oop.collections;

import java.util.LinkedList;

public class TestLinkedListWithQueueEx1 {

	private LinkedList queue;

	public void processStoreQueue() {
		queue = new LinkedList();
		queue.offer("happy");
		queue.offer("sad");
	}
	
	public void processRetrieveQueue() {
		while(queue.peek()!=null) {
			String info = (String)queue.poll();
			System.out.println("info:" + info);
		}
	}
	
	public static void main(String[] args) {
		TestLinkedListWithQueueEx1 test1 = new TestLinkedListWithQueueEx1();
		test1.processStoreQueue();
		test1.processRetrieveQueue();
	}

}
