package lists;

import java.util.*;


class Node<E>{
	E data;
	Node next,prev;
	
	public Node(E data) {
		this.data = data;
		next = null;
		prev = null;
	}	
}

class NodeInt{
	int data;
	NodeInt next ;
	
	
	public NodeInt(int data) {
		this.data = data;
		this.next = null;
		
	}
}

public class solution <E> {
	Node<E> head;

	public  void countPairs(LinkedList<Integer> head1,LinkedList<Integer>head2, int x) {
		int n1 = head1.size();
		for(int i=0;i<n1;i++) {
			int a = x- head1.get(i);
			if(head2.contains(a))
				System.out.println("(" + head1.get(i) + "," + a + ")");
		}
	}
	
	Node rotate(Node head, int p) {
		
		Node temp = head;
		if(p == 0) {
			return head;
		}
		
		int k = 1;
		while(k < p && temp != null) {
			temp = temp.next; 	k++;
		}
		
		Node nthNode = temp;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.prev = temp;
		head = nthNode.next;
		head.prev = null;
		nthNode.next = null;
		return head;
		
	}
	public int count(Node head, E c) {
		int sum = 0;
		Node temp = head;
		
		if(head == null) {
			return 0;
		}
		else {
			while(temp != null) {
				if(temp.data == c) {
					sum++;
				}
				temp = temp.next;
			}
			return sum;
		}
				
	}
	public static NodeInt addOne(NodeInt head) {
		
		
		
		return head;
	}

}
