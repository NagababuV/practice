package lambda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
//	public static void main(String[] args) {
//		new Thread(new CodeToRun()).start();
//	}

	
	public static void main(String[] args) {
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("printing from ananomoys class");
//				
//			}
//			
//		}).start();
//			
			
		new Thread(()->{System.out.println("from lambda expression ::");
		System.out.println("Line 2 ");
		System.out.println("This is line \n");
			
		
		
		}).start();
		
		
		Employee john = new Employee(13,"Nagbabau");
		Employee joh = new Employee(15,"A Surya");
		Employee jo = new Employee(17,"Chandrika V");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(john);
		employees.add(jo);
		employees.add(joh);
		
//		Collections.sort(employees, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee employee1, Employee employee2) {
//				return employee1.getName().compareTo(employee2.getName());
//			}
//			
//		});
		
		Collections.sort(employees,(Employee employee1,Employee employee2)-> employee1.getName().compareTo(employee2.getName()));
		
//		for(Employee employee : employees) {
//			System.out.println(employee.getName());
//		}
//		
//		String sillyString = doStringStuff(new UpperConcat() {
//			
//		})
//		 
	}
	
	public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
		return uc.upperAndConcat(s1,s2);
	}
}
