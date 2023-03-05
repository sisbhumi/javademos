package collectionsdemo;

import java.util.Queue;

public class QueueDemo {
	public static void main(String args[]) {
		//offer - adds element
		//peek - returns 1st element of queue
		//poll - removes 1st element
		//priority queue not allows duplicates
		
		Queue<Integer> queue = new PriorityQueue();
		System.out.println(queue.peek());
		
		Random random = new Random();
		for( int i = 1 ; i<= 10 ; i++) {
			queue.offer(random.nextInt(1,10));
		}
		System.out.println(queue);
		System.out.println(queue.poll);
		System.out.println(queue.remove(5));
	}
}
