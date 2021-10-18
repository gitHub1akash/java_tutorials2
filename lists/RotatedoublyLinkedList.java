package lists;

import java.util.*;
	
public class RotatedoublyLinkedList {
	
	static void display(Node node) {
		while( node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<Integer>();
		ll.add(1);
		Node head = new Node(1);
		Node current = head;
		for(int i=2; i<=6; i++) {
			ll.add(i);
			current.next = new Node(i);
			current = current.next;
		}
		int p = 2;
		solution so = new solution();
		
		System.out.println(ll);
		
		display(so.rotate(head, p));
	}
}
