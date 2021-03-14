package collections;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {

		PriorityQueue<LocalDate> pq = new PriorityQueue<>();
		pq.add(LocalDate.of(1906, 12, 9)); // G. Hopper
		
		pq.offer(LocalDate.of(1990, 6, 22)); 
		
		pq.add(LocalDate.of(1815, 12, 10)); // A. Lovelace
		pq.add(LocalDate.of(1903, 12, 3)); // J. von Neumann

		System.out.println(pq);
//		System.out.println("Removing elements...");
//		while (!pq.isEmpty())
//			System.out.println(pq.remove());
		System.out.println("View top");
		System.out.println(pq.peek());
		
		System.out.println("remove top");
		pq.poll();
		System.out.println(pq);

	}

}
