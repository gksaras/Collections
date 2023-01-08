package org.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/*Set => predefined Interface under java.util package
 	  => value based one
 	  => does not allow duplicates
 	  => maintains the order based on classes
 	  
 Types/Classes of Set
 	1.HashSet		=>random oder
 	2.LinkedHashSet =>insertion order
 	3.TreeSet		=>ascending order
 	
 Methods not supported in set
 	=>add(index,value)
 	=>indexOf
 	=>lastIndexOf
 	=>get,set
 	
 Generics
 	=> support only similar datatype
 	=> jdk version 1.5
 	=> <>---Generics--->inside the genrics we need to pass only wrapper class
 */
public class SetExample {
	public static void main(String[] args) {
		// Interface(Set) <generics> refName= new class(HashSet)<>();
		Set<Integer> s=new HashSet<>();
		s.add(23);
		s.add(34);
		s.add(45);
		s.add(56);
		s.add(67);
		s.add(78);
		s.add(23);
		System.out.println(s);
		
		int a = s.size();
		System.out.println(a);
		
		s.remove(78);
		System.out.println(s);
		
		for (Integer i : s) {
			System.out.println(i);
		}
		//TreeSet => prints ascending order
		Set<Character> s1=new TreeSet<>();
		s1.add(' ');
		s1.add('a');
		s1.add('A');
		s1.add('*');
		s1.add('1');
		s1.add('@');
		System.out.println(s1);
		//Based on the ASCII code it prints
		char p1=' ';
		int q1=p1;
		System.out.println(q1);
		char p2='*';
		int q2=p2;
		System.out.println(q2);
		char p3='1';
		int q3=p3;
		System.out.println(q3);
		char p4='@';
		int q4=p4;
		System.out.println(q4);
		char p5='A';
		int q5=p5;
		System.out.println(q5);
		char p6='a';
		int q6=p6;
		System.out.println(q6);
		
	}
}
