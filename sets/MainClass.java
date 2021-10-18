package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>();
//		
//		System.out.println(fruits.add("Apple"));
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		System.out.println(fruits.add("Apple"));
//		
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>();
		x.add(1);
		x.add(2);
		x.add(3);
		
		Set<Integer> y = new HashSet<>();
		y.add(1);
		y.add(3);
		
		
//		x.addAll(y); 
//		x.retainAll(y);
		System.out.println(x.containsAll(y));
		
		System.out.println(x);
	}

}
