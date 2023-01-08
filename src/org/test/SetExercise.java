package org.test;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		Set<Integer> s1=new HashSet<>();
		s1.addAll(l1);
		System.out.println(s1);
		for (Integer x : s1) {
			System.out.println(x);
		}
		Set<Integer> s2=new HashSet<>();
		s2.addAll(s1);
		s2.add(50);
		s2.add(70);
		s2.add(60);
		System.out.println(s2);
		s2.retainAll(s1);
		System.out.println(s2);
		
	}
}
