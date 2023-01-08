package org.test;

import java.util.ArrayList;
import java.util.HashSet; 
import java.util.List;
import java.util.Set;

public class Employee extends Details {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<Employee>(); // insertion order
		
		Set<Employee> s = new HashSet<Employee>(); // random order
		
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Joseph");
		e1.setEmail("joseph@gmail.com");
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("James");
		e2.setEmail("james@gmail.com");
		
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("Strange");
		e3.setEmail("strange@gmail.com");
		
		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("Rogera");
		e4.setEmail("rogers@gmail.com");
		
		Employee e5 = new Employee();
		e5.setId(105);
		e5.setName("Barnes");
		e5.setEmail("barnes@gmail.com");
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		// list -> for loop
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getEmail());
		}
		System.out.println();
		
		s.addAll(l);
		// set -> for each loop  
		for (Employee emp : s) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getEmail());
		}
	}
}

