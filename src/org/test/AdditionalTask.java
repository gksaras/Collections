package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdditionalTask {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(20);
		System.out.println(l);
		
		//To remove duplicates from list->convert into set
		Set<Integer> s=new HashSet<>();
		s.addAll(l);
		System.out.println(s);
		
		//To find the number of duplicates
		System.out.println(l.size()-s.size());
	}
}
