package lists;

import java.util.ArrayList;

import java.util.List;
public class MyArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("Mango");
		fruits.add("Guava");
		
		vegetables.add("potato");
		vegetables.add("carrot");
		
		fruits.addAll(vegetables);
		
		String temp[] = new String [fruits.size()];
		fruits.toArray(temp);
		
		List<String> toRemove = new ArrayList();
		toRemove.add("Apple");
		toRemove.add("Guava");
		
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		
		fruits.set(1,"banana");
		System.out.println(fruits);
		
		fruits.removeAll(toRemove);
		System.out.println(fruits);
		
		System.out.println(fruits.contains("water"));
		
		for(String e :temp) System.out.println(e);
		for(String t :fruits) System.out.println(t);

//		Pair<String, Integer> p1 = new Pair("Anuj", 457);
//		Pair<Boolean, String> p2 = new Pair(true, "Hello");
//		
//		p1.getDescription();
//		p2.getDescription(); 
	}

}
