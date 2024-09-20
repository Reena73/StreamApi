package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class sample {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Apple");
		l.add("Orange");
		l.add("Kiwi");
		l.add("Grapes");
		
     	l.stream().sorted((ele1,ele2) ->ele1.compareTo(ele2)).forEach(System.out::println);
     	System.out.println("-------------------");
     	
		l.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		l.stream().map(name ->name+" ->Fruits").forEach(System.out::println);
		System.out.println();
		
		
	}
}
