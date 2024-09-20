package streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Streamapi {
	public static void main(String[] args) {
		int[]ar= {4,6,8,9,3};
//		IntStream s= Arrays.stream(ar);
//		s=s.sorted();
//		s.forEach(System.out::println);
//		can view only one time
//		s.forEach(System.out::println);
		Arrays
		.stream(ar)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("------------------------");
		System.out.println("Array length:"+Arrays.stream(ar).count());
	}
}
