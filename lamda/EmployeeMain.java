package lamda;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
	public static void main(String args[]) {

		new Thread(() -> {

			System.out.println("Run from runnable");
			System.out.println("run");
			System.out.format("Thie lint %d\n", 3);

		}).start();

		Employee john = new Employee("John", 1);
		Employee tim = new Employee("Tim", 22);
		Employee jack = new Employee("Jack", 33);
		Employee snow = new Employee("Snow", 3);

		List<Employee> emp = new ArrayList<>();

		emp.add(john);
		emp.add(tim);
		emp.add(jack);
		emp.add(snow);

//		Collections.sort(emp,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//				
//		});

		Collections.sort(emp, (Employee em1, Employee em2) ->

		em1.getName().compareTo(em2.getName()));

		for (Employee emps : emp) {

			System.out.println(emps.getName());
		}

//		String sillyString = doStringStuff(new UpperCancat() {
//			@Override
//			public String upperAndConcat(String s1, String s2) {
//				return s1.toUpperCase() + s2.toUpperCase();
//
//			}
//
//		},
//
//				emp.get(0).getName(), emp.get(1).getName());
//
//		System.out.println(sillyString);
//
//	}

		UpperCancat uc = (s1,s2)-> s1.toUpperCase()+s2.toUpperCase();
		String sillyString = doStringStuff(uc,emp.get(0).getName(),emp.get(1).getName());
		System.out.println(sillyString);
		
		
	}
	public final static String doStringStuff(UpperCancat uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
	}
}

interface UpperCancat {
	public String upperAndConcat(String s1, String s2);
}
