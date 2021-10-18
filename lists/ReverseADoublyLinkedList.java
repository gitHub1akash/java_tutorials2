package lists;

import java.util.LinkedList;



public class ReverseADoublyLinkedList {
	static void display(NodeInt node) {
		while( node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<Integer>();
		ll.add(3);
		NodeInt head = new NodeInt(3);
		NodeInt current = head;
		
		ll.add(4);	current.next = new NodeInt(4);	current = current.next;
		ll.add(5);	current.next = new NodeInt(5);	current = current.next;
		
		
		abc so = new abc();
		display(so.reverseDLL(head));

	}

}
class abc{
	public static NodeInt reverseDLL(NodeInt  head)
	{
		NodeInt curr = head;
		NodeInt prev = null;
		NodeInt next ; 
			 while(curr != null) {
				 next = curr.next;
				 curr.next = prev;
				 
				 prev = curr; curr = next;
			 }
			 head = prev;
			 
			 return head;
	}
}
