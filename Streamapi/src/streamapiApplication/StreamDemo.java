package streamapiApplication;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		Employee e1 = new Employee("user1",101,5,50000);
		Employee e2 = new Employee("user2",102,4,40000);
		Employee e3 = new Employee("user3",103,2,30000);
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		
//		Stream <Employee> empstream = emplist.stream();
//		
//		Stream <Employee> empsalary = empstream.filter(no1-> no1.getSalary()>30000);
//		
//		Stream <String> empname = empsalary.map(no2 ->no2.getName());
//		empname.forEach(System.out::println);
		
//      Alterative method for above method		
		emplist.stream().map(no->no.getName()).forEach(System.out::println);
		
		System.out.println("-------------------");
		
		emplist.stream().filter(no1 ->no1.getSalary()>30000).map(no3 ->no3.getName()).forEach(System.out::println);
	}
}
