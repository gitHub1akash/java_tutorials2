package priorityQueues;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		
//		pq.add("kiwi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		System.out.println(pq);
//		
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(1);
		pq.add(5);
		pq.add(20);
		pq.add(10);
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	
	}

}
