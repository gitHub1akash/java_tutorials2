package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
	
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("One",1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);

		System.out.println(numbers);
//		
//		numbers.put("Three", 6);
//		numbers.putIfAbsent("Three", 9);
//		numbers.putIfAbsent("four", 4);
//		System.out.println(numbers);
//		
//		System.out.println(numbers.get("One")); 
		
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue() * 100);
		}
		System.out.println(numbers);
	}

}
