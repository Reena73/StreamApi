package streamapi;

import java.util.ArrayList;
import java.util.Comparator;

public class Parallelstream {
public static void main(String[] args) {
	ArrayList<Integer> ar=new ArrayList<Integer>();
	ar.add(20);
	ar.add(30);
	ar.add(50);
	ar.add(40);
	ar.add(10);
	
	ar.parallelStream().forEach(System.out::println);  //no order follow
	System.out.println("-------------");
	
	ar.parallelStream().forEachOrdered(System.out::println);  //follow input order
	System.out.println("-------------");
	
	ar.parallelStream().sorted().forEachOrdered(System.out::println);  // follow ascending order
	System.out.println("-------------");
	
	ar.parallelStream().sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);  //follow descending order
	System.out.println("-------------");
	
	ar.stream().parallel().forEachOrdered(System.out::println);  
}
}
