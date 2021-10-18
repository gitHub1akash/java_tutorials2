package deque;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
//		ArrayDeque As queue
		System.out.println("ArrayDeque As queue");
		ad.addFirst(12);
		ad.addFirst(23);
		ad.addFirst(96);
		ad.addFirst(56);
		System.out.println(ad);
		ad.pop();
		System.out.println(ad);
		ad.remove();
		System.out.println(ad);
		System.out.println(ad.peek());
		
		System.out.println("ArrayDeque As stack");
		ad.push(100);
		ad.push(120);
		ad.push(965);
		System.out.println(ad);
		System.out.println(ad.pop());
		System.out.println(ad);
		System.out.println(ad.pop());
		System.out.println(ad);
	}

}
