package streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Hashmapstream {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Apple", 100);
		hm.put("Eat", 400);
		hm.put("Dog", 200);
		hm.put("Cat", 500);
		hm.put("Book", 700);
		
		hm.keySet().stream().forEach(System.out::println);
		System.out.println("------------------");
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("------------------");
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("------------------");
		
		List<String> l = hm.keySet().stream().collect(Collectors.toList());
		System.out.println(l);
		
		Set<String> s= hm.keySet().stream().collect(Collectors.toSet());
		System.out.println(s);
		
		List<Integer> l1 = hm.values().stream().collect(Collectors.toList());
		System.out.println(l1);
		
		Set<Integer> s1 = hm.values().stream().collect(Collectors.toSet());
		System.out.println(s1);
		
//		Boolean b = hm.keySet().stream().anyMatch(name ->name.endsWith("t"));
		Boolean b= l.stream().anyMatch(name ->name.endsWith("k"));
		System.out.println(b);
		
		Boolean result = l.stream().allMatch(name ->name.endsWith("k"));
		System.out.println(result);
		
	}
}
