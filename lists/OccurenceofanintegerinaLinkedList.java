package lists;

import java.util.*;


public class OccurenceofanintegerinaLinkedList{
	
	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		LinkedList <Integer>ll = new LinkedList<Integer>();
		

		System.out.println("enter 6 elements");
		
		int a = sc.nextInt(); 
		
		ll.add(a); 		Node head = new Node(a);
		Node current = head;
		for(int i=1; i<6; i++) {
			ll.add(i);
			current.next = new Node(i);
			current = current.next;
		}
	        
	    int toCount = 1;
	    solution so = new solution();
	        
		System.out.println("Occurence of 1 in linked list is "+ so.count(head, toCount));
		
	}

}
