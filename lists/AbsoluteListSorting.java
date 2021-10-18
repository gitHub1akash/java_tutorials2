package lists;

import java.util.LinkedList;


public class AbsoluteListSorting {
	
	static void display(NodeInt node) {
		while( node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<Integer>();
		ll.add(1);
		NodeInt head = new NodeInt(1);
		NodeInt current = head;
		
		ll.add(-2);	current.next = new NodeInt(-2);	current = current.next;
		ll.add(-3);	current.next = new NodeInt(-3);	current = current.next;
		ll.add(4);	current.next = new NodeInt(4);	current = current.next;
		ll.add(-5);	current.next = new NodeInt(-5);	current = current.next;
		
		
		gfG so = new gfG();
		display(so.sort(head));
		

	}

}
class gfG{
	 public NodeInt sort(NodeInt head) {
		 NodeInt curr = head;
		 while(curr!= null) {
			 NodeInt min = curr;
			 
			 while(min != null) {
				 if(curr.data > min.data) {
					 int temp = curr.data;
						curr.data = min.data;
						min.data = temp;
				 }
				 min = min.next;
			 }
			 curr = curr.next;
		 }
		 return head;
	}

}
