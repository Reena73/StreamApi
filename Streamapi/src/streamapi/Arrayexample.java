package streamapi;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Arrayexample {
	public static void main(String[] args) {
		int[] ar= {5,9,4,6,7,3,2,1,6};
		OptionalInt od=Arrays.stream(ar).max();
		System.out.println(od.getAsInt());
		
		OptionalDouble od1=Arrays.stream(ar).average();
		System.out.println(od1.getAsDouble());
		
//		System.out.println(Arrays.stream(ar).min());
		OptionalInt od2=Arrays.stream(ar).min();
		System.out.println(od2.getAsInt());
		
		OptionalInt od3=Arrays.stream(ar).findAny();
		System.out.println(od3.getAsInt());
		
		OptionalInt od4=Arrays.stream(ar).findFirst();
		System.out.println(od4.getAsInt());
		
		Long od5=Arrays.stream(ar).count();
		System.out.println(od5);
		
//      System.out.println(Arrays.stream(ar).count());
		
		Arrays.stream(ar).sorted().distinct().forEach(sys->System.out.print(sys+","));
		
		System.out.println();
		
		Arrays.stream(ar).filter(no -> no%3==0).forEach(System.out::print);

	}
}
