package vectorAndStacks;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception{
		
//		Vector<Integer> v = new Vector();
//		
//		v.add(6);
//		v.add(3);
		
		Stack<Integer> stack = new Stack();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		System.out.println(stack);
		int popped = stack.pop();
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		
//		Below is my in bulit MyStack
		
//		MyStack<Integer> stack = new MyStack();
//		
//		stack.push(12);
//		stack.push(24);
//		stack.push(36);
//		
//		int popped = stack.pop();
//		System.out.println(popped);
//		
//		int peeked = stack.peek();
//		System.out.println(peeked);
		
	}

}
