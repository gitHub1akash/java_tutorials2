package lists;

import java.util.LinkedList;

public class Add1ToANumberRepresentedAsALinkedist {
	
	static void display(NodeInt node) {
		while( node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<Integer>();
		ll.add(4);
		NodeInt head = new NodeInt(4);
		NodeInt current = head;
		
		ll.add(9);	current.next = new NodeInt(9);	current = current.next;
		ll.add(9);	current.next = new NodeInt(9);	current = current.next;
		ll.add(9);	current.next = new NodeInt(9);	current = current.next;
		
		solution so = new solution();
		display(so.addOne(head));
		

	}

}

