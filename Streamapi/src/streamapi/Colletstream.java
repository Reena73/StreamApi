package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Colletstream {
	public static void main(String[] args) {
		List <Integer>l=new ArrayList<Integer>();
		l.add(50);
		l.add(30);
		l.add(40);
		l.add(40);
		l.add(20);
		l.add(50);
		
		System.out.println(l.stream().count());
		
		l.stream().distinct().forEach(no ->System.out.print(no+" "));
//		l.stream().distinct().map(no->no+" ").forEach(System.out::print);
		System.out.println();
		
		l.stream().distinct().sorted().forEach(no ->System.out.print(no+" "));
		System.out.println();
		
		l.stream().distinct().sorted(Comparator.reverseOrder()).forEach(no ->System.out.print(no+" "));
		System.out.println();
		
		l.stream().map(no -> no/2+" ").forEach(System.out::print);
		System.out.println();
		
		l.stream().limit(3).forEach(no ->System.out.print(no+" "));
		System.out.println();
		
		l.stream().limit(3).skip(2).forEach(no ->System.out.println(no+" "));
		System.out.println();
		
//	    Terminal operator	
		Optional<Integer> al= l.stream().reduce((no1,no2)-> no1+no2);
		System.out.println(al.get());
	
//		how to store stream(do not store directly we can store object or array)
		Object[] ob=l.stream().toArray();
		for(Object o:ob) {
			System.out.println(o);
		}
		
		System.out.println("-----------");	
//		list is a collection of object so use compare object operator
		Optional<Integer> od=l.stream().max((elem1,elem2)->elem1.compareTo(elem2));
		System.out.println(od.get());
			
	}
}
